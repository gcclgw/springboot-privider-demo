package com.jk.utils;


import com.jk.mapper.timer.TimerMapper;
import com.jk.model.cont.Contx;
import com.jk.service.timer.TimerService;
import com.jk.service.timer.TimerServiceImpl;
import com.jk.service.work.WorkService;
import com.jk.utils.common.IndustrySMS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Component
public class MyTimer{
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Autowired
     private  TimerService timerService;

    @Autowired
     private WorkService workService;


    @Scheduled(cron = "00 37 21 * * ?")
    public void timerRate() throws ParseException {
        //System.out.println(sdf.format(new Date()));
        selectContractIng();

    }


    public  void  selectContractIng() throws ParseException {
        List<Contx> contxes = timerService.queryCont();
        Date time = new Date();

        if (contxes!=null ){
            for (int i = 0 ; i<contxes.size();i++){
                String endtime = contxes.get(i).getEndtime();
                Date parse = sdf.parse(endtime);
               long date  =  (parse.getTime()-time.getTime())/1000/3600/24;
               date=date+1;
                if (date==30 ||date==27 ||date==24 ||date==21 ||date==18 ||date==15 ||date==12 || date==9 ||date==6  ){
                    IndustrySMS.execute("13146789257");
                    System.out.println(111);
                }if (date == 5 ){
                    workService.addWork(contxes.get(i).getHtid());
                }
                System.out.println(date);

            }
        }
    }





}

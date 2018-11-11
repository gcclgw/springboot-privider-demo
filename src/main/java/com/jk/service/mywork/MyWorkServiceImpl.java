package com.jk.service.mywork;

import com.jk.mapper.mywork.MyWorkMapper;
import com.jk.model.mywork.Contxract;
import com.jk.model.mywork.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyWorkServiceImpl implements MyWorkService {
    @Autowired
    private MyWorkMapper myWorkMapper;
    @Override
    public List<Contxract>   queryMyWorkByTime() {
        return myWorkMapper.queryMyWorkByTime();
    }

    @Override
    public void upDhwjt(Contxract contxract) {
        myWorkMapper.upDhwjt(contxract.getHtid());
    }

    //解约  的通话记录
    @Override
    public void addText(Work work,Contxract contxract) {
        myWorkMapper.addText(work.getText(),contxract.getHtid());
    }


    @Override
    public void upJy(Contxract contxract) {
        myWorkMapper.upJy(contxract.getHtid().toString());
    }


    @Override
    public void upXy(Contxract contxract) {
        myWorkMapper.upXy(contxract.getHtid());
    }

    @Override
    public void upZkl(Contxract contxract) {
        myWorkMapper.upZkl(contxract.getHtid());
    }
}

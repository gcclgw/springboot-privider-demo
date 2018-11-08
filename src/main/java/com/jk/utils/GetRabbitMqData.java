package com.jk.utils;

import org.springframework.stereotype.Component;

@Component
/*@RabbitListener(queues = "chuchu")*/
public class GetRabbitMqData {

    /*@RabbitHandler
    public void getMsg(String msg){
        //System.out.println(msg);

      *//*  JSONObject jb = JSONArray.parseObject(msg);
        Integer id = jb.getInteger("id");*//*

        System.out.println(msg);

    }*/


}

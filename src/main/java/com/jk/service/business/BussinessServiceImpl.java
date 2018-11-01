package com.jk.service.business;

import com.alibaba.fastjson.JSONObject;
import com.jk.mapper.business.BusinessMapper;
import com.jk.model.business.Business;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BussinessServiceImpl implements  BussinessService {

    @Autowired
    private BusinessMapper businessMapper;

    @Override
    public List queryBusiness() {

        List<Business> list = businessMapper.queryBusiness();


        return list;
    }

    @Override
    public void deleteBus(Integer qid) {
        businessMapper.deleteBus(qid);
    }


}

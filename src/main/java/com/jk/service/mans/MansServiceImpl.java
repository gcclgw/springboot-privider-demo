package com.jk.service.mans;

import com.alibaba.dubbo.common.json.JSONObject;
import com.jk.mapper.mans.MansMapper;
import com.jk.model.mans.Userx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MansServiceImpl implements  MansService  {
@Autowired
private MansMapper mansMapper;

    @Override
    public List<Userx> queryuser() {
        return mansMapper.queryuser();
    }

    @Override
    public void deleteMans(String uid) {
        mansMapper.deleteMans(uid);
    }



    @Override
    public Userx updateMans(String uid) {
        return mansMapper.updateMans(uid);
    }

    @Override
    public void updateAdd(Userx u) {
        mansMapper.updateAdd(u);
    }


}

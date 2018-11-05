package com.jk.service.loginUser;

import com.alibaba.fastjson.JSONObject;
import com.jk.mapper.loginUser.LoginUserMapper;
import com.jk.model.orders.Orders;
import com.jk.model.users.Users;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LoginUserServiceImpl implements LoginUserService {
    @Autowired
    private LoginUserMapper loginUserMapper;

    @Override
    public JSONObject loginUser(Users users) {
        int flag = 0 ;
        JSONObject json = new JSONObject();
        List<Users> list = loginUserMapper.loginUser(users.getUsername());
        if (list.size()>0){
            flag = 1 ;
            if (list.get(0).getPassword().equals(users.getPassword())){
                flag = 2 ;
                Users dbuser = list.get(0);
                json.put("dbuser",dbuser);
            }
        }
        json.put("flag",flag);

        return json;
    }

    @Override
    public List<Orders> queryOrder(Integer uid) {

        return loginUserMapper.queryOrder(uid);
    }


}

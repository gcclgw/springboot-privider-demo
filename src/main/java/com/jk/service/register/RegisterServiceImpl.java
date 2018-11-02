package com.jk.service.register;

import com.jk.mapper.register.RegisterMapper;

import com.jk.model.users.Users;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RegisterServiceImpl implements  RegisterService {
   @Autowired
   private RegisterMapper registerMapper;



    @Override
    public int regUser(Users users) {
        int flag = 0;
        List<Users> list = registerMapper.queryUserByName(users.getUsername());
        if (list.size()>0){
            flag = 1;
        }else {
            registerMapper.regUser(users);
            flag = 2;
        }
         return flag;
    }
}

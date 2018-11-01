package com.jk.service.login;

import com.jk.mapper.login.LoginMapper;
import com.jk.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service("loginService")
public class LoginServiceImpl  implements LoginService{

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public Map<String, Object> login(User user) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (null == user.getUserImgCode()) {
            //验证码为空
            map.put("flag", "1");
        } else if (user.getUserImgCode().equals(user.getUserImgCode())) {
            //验证码正确，可以登录
            user.setPassword(user.getPassword());
            User u = loginMapper.login(user);
            if (null == u) {
                //用户名或密码错误
                map.put("flag", "3");
            } else {
                //登陆成功
                map.put("flag", "4");
                map.put("userInfo", u);
            }
        } else {
            //验证码错误
            map.put("flag", "2");
        }
        return map;
    }

    /*@Override
    public User loginUserName(String userName) {
        return loginMapper.loginUserName(userName);
    }*/
}

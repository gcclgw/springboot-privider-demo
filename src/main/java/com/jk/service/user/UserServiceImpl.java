package com.jk.service.user;

import com.jk.mapper.user.UserMapper;
import com.jk.model.role.Role;
import com.jk.model.user.User;
import com.jk.utils.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public ResultPage selectUserList(User user) {
        user.calculate();
        ResultPage resultPage = new ResultPage();
        int  count = userMapper.getUserCount(user);
        resultPage.setTotal(count);
        List<User> users = userMapper.selectUserList(user);
        resultPage.setRows(users);
        return resultPage;
    }

    @Override
    public List<User> findUserRoleById(String userId) {
        List<User>  roleList = userMapper.findUserRoleById(userId);

        return roleList;
    }

    @Override
    public  ResultPage findRole(Role role) {

        role.calculate();
        ResultPage resultPage = new ResultPage();
        int  count = userMapper.getRoleCount(role);
        resultPage.setTotal(count);
        List<User> users = userMapper.selectRoleList(role);
        resultPage.setRows(users);
        return resultPage;
    }

    @Override
    public void SaveUserRole(String userId, String[] roleIds) {
        userMapper.deleteUserRole(userId);
        userMapper.SaveUserRole(userId,roleIds);

    }
}

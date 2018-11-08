package com.jk.service.role;

import com.jk.mapper.role.RoleMapper;
import com.jk.model.power.PowerTree;
import com.jk.model.role.Role;
import com.jk.model.user.User;
import com.jk.utils.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public ResultPage selectRoleList(Role role) {
        role.calculate();
        ResultPage resultPage = new ResultPage();
        int  count = roleMapper.getRoleCount(role);
        resultPage.setTotal(count);
        List<User> users = roleMapper.selectRoleList(role);
        resultPage.setRows(users);
        return resultPage;
    }

    @Override
    public List<Role> findRolePowerById(String rid) {
        List<Role>  roleList = roleMapper.findRolePowerById(rid);
        return roleList;
    }

    @Override
    public List<LinkedHashMap<String, String>> findPower(PowerTree power) {
        return roleMapper.findPower(power);
    }

    @Override
    public void saveRolePower(String rid, String[] pids) {
        roleMapper.deleteRolePower(rid);
        roleMapper.saveRolePower(rid,pids);


    }





}

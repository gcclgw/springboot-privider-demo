package com.jk.mapper.role;

import com.jk.model.power.PowerTree;
import com.jk.model.role.Role;
import com.jk.model.user.User;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedHashMap;
import java.util.List;

public interface RoleMapper {
    int getRoleCount(Role role);

    List<User> selectRoleList(Role role);

    List<Role> findRolePowerById(String rid);

    List<LinkedHashMap<String, String>> findPower(PowerTree power);

    void deleteRolePower(String rid);

    void saveRolePower(String rid, @Param("pids")String[] pids);



}

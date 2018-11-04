package com.jk.mapper.user;

import com.jk.model.role.Role;
import com.jk.model.user.User;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedHashMap;
import java.util.List;

public interface UserMapper {
    int getUserCount(User user);

    List<User> selectUserList(User user);

    List<User> findUserRoleById(String userId);

   /* List<LinkedHashMap<String, String>> findRole(Role role);*/

    void deleteUserRole(String userId);

    void SaveUserRole(String userId, @Param("roleIds")String[] roleIds);

    int getRoleCount(Role role);

    List<User> selectRoleList(Role role);
}

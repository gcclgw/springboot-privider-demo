package com.jk.mapper.loginUser;

import com.jk.model.users.Users;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface LoginUserMapper {
    @Select("select * from user where username = #{username}")
    List<Users> loginUser(@Param("username") String username);
}

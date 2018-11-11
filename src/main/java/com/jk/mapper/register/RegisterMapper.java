package com.jk.mapper.register;


import com.jk.model.users.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RegisterMapper {
    @Select("select * from user where username = #{username}")
    List<Users> queryUserByName(@Param("username") String username);

    @Insert("insert into `user`(username,password,`name`,email,phone,addr,state,members,integral) values(#{username},#{password},#{name},#{email},#{phone},#{addr},1,1,100)")
    void regUser(Users user);
}

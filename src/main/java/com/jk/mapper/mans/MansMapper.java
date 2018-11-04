package com.jk.mapper.mans;

import com.jk.model.mans.Userx;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import java.util.List;

public interface MansMapper {

    @Select("select * from user ")
    List<Userx> queryuser();

    @Delete("delete from user where uid=#{uid} ")
    void deleteMans(String uid);

    @Select("select * from user where uid=#{uid} ")
    Userx updateMans(String uid);
   @Update("update user set username=#{u.username},password=#{u.password},name=#{u.name},email=#{u.email},phone=#{u.phone},addr=#{u.addr} where uid=#{u.uid}   ")
    void updateAdd(@Param("u") Userx u);
}

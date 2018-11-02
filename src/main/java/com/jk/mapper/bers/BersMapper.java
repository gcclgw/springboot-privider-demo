package com.jk.mapper.bers;

import com.jk.model.mans.Userx;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BersMapper {
    @Select("select * from user where members=3")
    List<Userx> bersSelect();

    @Update("update user set members=1 where uid=#{uid}  ")
    void delDers(String uid);

    @Select("select * from user where uid=#{uid} ")
    Userx updateBers(String uid);

    @Update("update user set username=#{u.username},password=#{u.password},name=#{u.name},email=#{u.email},phone=#{u.phone},addr=#{u.addr} where uid=#{u.uid}   ")
    void updateAdds(@Param("u") Userx u);
    @Select("select * from user where members!=3")
    List<Userx> memSelect();
    @Update("update user set members=3 where uid=#{uid}  ")
    void updateMen(String uid);
}

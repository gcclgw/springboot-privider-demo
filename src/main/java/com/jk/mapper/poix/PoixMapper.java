package com.jk.mapper.poix;

import com.jk.model.cont.Contx;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface PoixMapper {

    @Select("select * from contract where htid=#{htid}")
    List<Contx> selectUsers(String htid);

  @Select("SELECT count(*) FROM contract WHERE htname=#{htname}")
    int selectByName(String name);

@Insert("INSERT INTO contract (htname,htstatus,startdate,endtime,qid,creatdate,htinfo) VALUES (#{htname},#{htstatus},#{startdate},#{endtime},#{qid},#{creatdate},#{htinfo})")
    void addUser(Contx userResord);

@Update("update contract set htstatus=#{startdate},startdate,#{startdate},endtime,#{endtime},qid,#{qid},creatdate,#{creatdate},htinfo,#{htinfo} where htname = #{htname}")
    void updateUserByName(Contx userResord);



}

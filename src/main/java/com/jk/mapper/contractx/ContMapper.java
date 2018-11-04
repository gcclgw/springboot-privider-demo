package com.jk.mapper.contractx;

import com.jk.model.cont.Contx;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ContMapper {
    @Select("select * from contract")
    List<Contx> queryCont();
    @Insert("INSERT INTO contract (htname,htstatus,startdate,endtime,qid,creatdate,htinfo) VALUES (#{htname},#{htstatus},#{startdate},#{endtime},#{qid},now(),#{htinfo})")
    void poixAdd(Contx contx);
}

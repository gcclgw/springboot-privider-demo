package com.jk.mapper.business;

import com.jk.model.business.Business;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BusinessMapper {



    @Select("select * from business")
    List<Business> queryBusiness();

    @Delete("delete from business where qid = #{qid}")
    void deleteBus(Integer qid);

    @Insert("insert into business(qname,qstatus) values(#{qname},1)")
    void addBus(Business business);
}

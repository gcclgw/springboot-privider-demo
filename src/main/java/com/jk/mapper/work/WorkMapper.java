package com.jk.mapper.work;

import com.jk.model.work.Work;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface WorkMapper {

    @Insert("insert into work(htid,htstate) values(#{htid},1) ")
    void addWork(Integer htid);

    @Select("select w.* ,c.htname as htname,c.htphone as htphone,c.endtime as endtime,c.startdate as startdate ,b.qname as qname,c.htinfo as hinfo from work w , contract c,business b where w.htid = c.htid and c.qid = b.qid and w.htstate=1 or w.workstyle = 3 group by w.workid")
    List<Work> queryWork();


    @Update("update work set htstate = 2 ,workstyle = #{workstyle},text = #{text} where htid=#{htid}")
    void updateWork(Work work);

    @Update("update contract set endtime = DATE_ADD(endtime, INTERVAL 1 YEAR) where htid = #{htid}")
    void updateContXy(Integer htid);

    @Update("update contract set htstate = 2 where htid = #{htid}")
    void updateContJy(Integer htid);
}

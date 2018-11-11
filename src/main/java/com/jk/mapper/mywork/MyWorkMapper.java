package com.jk.mapper.mywork;

import com.jk.model.mywork.Contxract;
import com.jk.model.mywork.Work;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface MyWorkMapper {

    @Select("select  c.htid htid,c.htname htname,c.htphone htphone,c.htstate  htstate  from contract c   where (timestampdiff(day,sysdate(),c.endtime)) BETWEEN 0 and 5   and c.htstate !=3 ")
    List<Contxract>  queryMyWorkByTime();

    @Update("update  contract  set htstate =1 where htid=${htid}")
    void upDhwjt(@Param("htid")Integer htid);

    @Update("update  contract set htstate =3 where htid=${htid}")
    void upJy(@Param("htid")String htid);

    @Update("UPDATE contract c SET  c.endtime=DATE_ADD(c.endtime, INTERVAL 1 YEAR) where  c.htid=${htid}")
    void upXy(@Param("htid")Integer htid);


    @Insert(" insert into work(text,htid) values(#{text},#{htid})")
    void addText(@Param("text")String text,@Param("htid")Integer htid);

    @Update("update  contract set htstate =4 where htid=${htid}")
    void upZkl(@Param("htid")Integer htid);
}

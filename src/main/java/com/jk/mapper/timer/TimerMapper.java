package com.jk.mapper.timer;

import com.jk.model.cont.Contx;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TimerMapper {
    @Select("select  c.htphone,c.htid  from contract c  where  (timestampdiff(day,sysdate(),c.endtime)) BETWEEN 5 and 15 and c.htstate = 1")
    List<Contx> queryPhone();

    @Select("select  c.htstatus,c.htid  from contract c  where  (timestampdiff(day,sysdate(),c.endtime)) BETWEEN 15 and 30 and c.htstate = 1")
    List<Contx> queryEmil();


    @Select("select  c.htphone,c.htid  from contract c  where  (timestampdiff(day,sysdate(),c.endtime)) BETWEEN 0 and 5 and c.htstate = 1")
    List<Contx> queryTel();

    @Select("select  c.*  from contract c where c.htstate = 1")
    List<Contx> queryCont();
}

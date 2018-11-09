package com.jk.mapper.timing;

import com.jk.model.mywork.Contxract;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TimingMapper {
    //查询出还有15天到期的合同  然后判断具体时间 发短信
    @Select("select  c.htphone htphone,c.endtime  endtime from contract c   where  (timestampdiff(day,sysdate(),c.endtime)) BETWEEN 0 and 15   and c.htstate !=3")
    List<Contxract> queryHtPhone();
}

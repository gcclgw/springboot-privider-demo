package com.jk.mapper.powerTree;

import com.jk.model.power.PowerTree;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


import java.util.List;

public interface PowerTreeMapper {

    @Select("select  id ,  text , url as href ,pid from t_powertree  where pid = #{value}")
    List<PowerTree> getNode(@Param("value") String id);

    /*@Select("select  id ,  text , url as href ,pid from t_powertree  where pid = #{value}")
    List<PowerTree> getNodes(String id);*/


 /*   List<PowerTree> getUserPowerChildrenList(String userId);

    List<PowerTree> getParent(Integer pid);

    List<String> getUserPowerUrlListByUserId(String userId);*/


}

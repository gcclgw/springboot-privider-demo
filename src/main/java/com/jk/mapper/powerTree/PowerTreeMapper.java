package com.jk.mapper.powerTree;

import com.jk.model.power.PowerTree;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


import java.util.List;

public interface PowerTreeMapper {

    /*@Select("select  id ,  text , url as href ,pid from t_powertree  where pid = #{value}")
    List<PowerTree> getNode(String id,String userId);*/

    @Select("select DISTINCT tp.id as id  , tp.text as text , tp.url as href ,tp.pid as pid from t_powertree tp  " +
            "LEFT JOIN  role_power rp on rp.pid  = tp.id  " +
            "LEFT JOIN t_role  tr on tr. rid  = rp.rid  " +
            "LEFT JOIN t_nexus tn on tr.rid  = tn.rid " +
            "where  tn.uid = #{userId} and tp.pid = #{id}")
    List<PowerTree> getNode(@Param("id") String id,@Param("userId") String userId);
 /*   @Select("select  id ,  text , url as href ,pid from t_powertree  where pid = #{value}")
    List<PowerTree> getNode(@Param("value") String id);*/

    /*@Select("select  id ,  text , url as href ,pid from t_powertree  where pid = #{value}")
    List<PowerTree> getNodes(String id);*/


   /*List<PowerTree> getUserPowerChildrenList(String userId);*/

   /*  List<PowerTree> getParent(Integer pid);

    List<String> getUserPowerUrlListByUserId(String userId);*/


}

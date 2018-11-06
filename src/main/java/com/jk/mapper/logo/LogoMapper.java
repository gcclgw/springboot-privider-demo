package com.jk.mapper.logo;

import com.jk.model.logo.Logo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface LogoMapper {

    @Update("update logo set logimg = #{logo}")
    void updateLogo(@Param("logo") String logo);

    @Select("select * from logo ")
    List<Logo> queryLogo();
}

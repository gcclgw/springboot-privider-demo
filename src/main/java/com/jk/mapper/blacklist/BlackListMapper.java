package com.jk.mapper.blacklist;

import com.jk.model.blacklist.BlackList;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BlackListMapper {
    @Select("select * from blacklist where uphone = #{uphone}")
    List<BlackList> queryByUid(@Param("uphone") String uphone);
}

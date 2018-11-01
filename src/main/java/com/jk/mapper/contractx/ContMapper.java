package com.jk.mapper.contractx;

import com.jk.model.cont.Contx;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ContMapper {
    @Select("select * from contract")
    List<Contx> queryCont();
}

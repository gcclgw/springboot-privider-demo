package com.jk.mapper.check;

import com.jk.model.commodity.Product;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CheckMapper {
    @Select("select * from product where status = 1")
    List<Product> queryVipProduct();

    @Update("update product set status = 2 where pid = #{pid}")
    void updatePro(Integer pid);
}

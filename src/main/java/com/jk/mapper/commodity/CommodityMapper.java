package com.jk.mapper.commodity;

import com.jk.model.commodity.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CommodityMapper {

    @Select(" select * from commodity ")
    List<Product> queryProduct();
}

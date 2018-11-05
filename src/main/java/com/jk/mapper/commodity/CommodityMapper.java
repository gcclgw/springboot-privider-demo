package com.jk.mapper.commodity;

import com.jk.model.commodity.Categorysecond;
import com.jk.model.commodity.CommodityProperty;
import com.jk.model.commodity.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CommodityMapper {

    /*查询*/
    @Select(" select * from product where status=2 order by is_hot desc ")
    List<Product> queryCommodity();
    /*删除*/
    @Delete(" delete from product where pid=#{pid} ")
    void deleteCommodity(@Param("pid") String pid);
    /*查询二级属性下拉框*/
    @Select(" select * from categorysecond ")
    List<Categorysecond> querycsid();
    /*新增*/
    @Insert(" insert into product(pname,market_price,shop_price,pdesc,pdate,csid,image) values(#{product.pname},#{product.market_price},#{product.shop_price},#{product.pdesc},#{product.pdate},#{product.csid},#{product.image})")
    void addCommodity(@Param("product") Product product);
    /*根据id回显*/
    @Select(" select * from product where pid=#{pid}")
    Product toupdate(Integer pid);
    /*修改*/
    @Update(" update product set pname=#{product.pname},market_price=#{product.market_price},shop_price=#{product.shop_price},pdesc=#{product.pdesc},csid=#{product.csid},image=#{product.image} where pid=#{product.pid}")
    void updateCommodity(@Param("product") Product product);
    /*添加属性*/
    @Insert(" insert into commodityproperty (productid,cname,cvalue) values(#{pid},#{splitname},#{splitvalue}) ")
    void addtjsx(@Param("pid") Integer pid,@Param("splitname") String splitname,@Param("splitvalue") String splitvalue);

    /*查询状态为未审核的*/
    @Select(" select * from product where status=1 ")
    List<Product> queryByStatus();

    /*商品审核*/
    @Update(" update product set status=2 where pid=#{pid}")
    void updateStatus(Integer pid);

    /*查询热销商品*/
    @Select(" select * from product where status=2 order by is_hot desc limit 10 ")
    List<Product> querySell();

    /*查询最新商品*/
    @Select(" select * from product where status=2 order by pdate desc limit 10 ")
    List<Product> queryDate();

    /*一级分类查询*/
    @Select(" select p.* from product p left join categorysecond cs on p.csid=cs.csid left join category c on cs.cid=c.cid where c.cid=#{cid} and p.status=2 OR cs.csid = #{csid} and p.status=2")
    List<Product> thePrimaryQuery(@Param("cid") String cid,@Param("csid") String csid);

    /*商品详情*/
    @Select(" select * from product where pid=#{pid}")
    List<Product> queryDetails(@Param("pid")String pid);

    /*商品属性*/
    @Select(" select c.* from product p left join commodityproperty c on p.pid=c.productid where p.pid=#{pid} ")
    List<CommodityProperty> queryCommodityProperty(@Param("pid") String pid);
}

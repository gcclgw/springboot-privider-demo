package com.jk.mapper.commodity;

import com.jk.model.commodity.Categorysecond;
import com.jk.model.commodity.CommodityProperty;
import com.jk.model.commodity.Product;
import com.jk.model.orders.Orders;
import com.jk.model.users.Users;
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
    @Insert(" insert into product(pname,market_price,shop_price,pdesc,pdate,csid,image,status) values(#{product.pname},#{product.market_price},#{product.shop_price},#{product.pdesc},#{product.pdate},#{product.csid},#{product.image},1)")
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

    /*点击量加一*/
    @Update(" update product set is_hot=is_hot+1 where pid=#{pid}")
    void updateIs_Hot(@Param("pid") String pid);

    //查询总条数
    @Select("select count(1) from product")
    int selectProductCount(Product product);

    //查询list
    @Select("select p.* from product p left join categorysecond cs on p.csid=cs.csid left join category c on cs.cid=c.cid where c.cid=#{cid} AND p.status = 2 OR cs.csid = #{csid} AND p.status = 2 limit #{startIndex},#{rows}")
    List<Product> selectProductList(Product product);

    /*查询食品*/
    @Select(" select * from product where status=3 ")
    List<Product> queryShopIntegral();


    /*新增订单*/
    @Insert(" insert into orders (oid,total,ordertime,uid,otype) values(#{orders.oid},#{orders.total},now(),#{orders.uid},2) ")
    void addOrders(@Param("orders") Orders orders);

    /*新增商品订单关联表*/
    @Insert(" insert into orderitem(count,subtotal,pid,oid) values(#{count},#{i},#{product.pid},#{orders.oid}) ")
    void addOrdersitem(@Param("i") int i,@Param("product") Product product,@Param("count") Integer count,@Param("orders") Orders orders);

    /*查询关联商品*/
    @Select("select p.image,p.pname,p.shop_price,oi.count as count,oi.subtotal as subtotal from orders o left join orderitem oi on o.oid=oi.oid left join product p on oi.pid=p.pid where o.oid=#{orders.oid} and p.`status`=3")
     Product selectProduct(@Param("orders") Orders orders);

    /*用户信息回显*/
    @Select(" select * from user where uid=#{uid}")
    Users selectUsers(Integer uid);

    /*修改订单信息*/
    @Update(" update orders set name=#{orders.name},phone=#{orders.phone},addr=#{orders.addr},state=3 where oid=#{orders.oid}")
    void updateOrder(@Param("orders")Orders orders);

    /*修改积分*/
    @Update(" update user set integral=integral-#{ssss} where uid=#{userid}")
    void updateUsers(@Param("ssss")Integer ssss,@Param("userid") Integer userid);


    /*增加积分*/
    @Update(" update user set integral=integral+#{awards} where uid=#{uid}")
    void addJf(@Param("awards") Integer awards,@Param("uid") Integer uid);
}

package com.jk.mapper.orders;

import com.jk.model.orders.Orders;
import com.jk.model.orders.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface OrdersMapper {



    @Select("select o.*,o.oid orderid from  orders  o")
    List<Orders> queryOrdersPage();

    @Update("update orders set state=4 where oid=#{oid}")
    void fahuo(Integer oid);

    @Select("select p.*,p.market_price marketPrice,p.shop_price shopPrice,p.is_hot isHot from orderitem op,product p where op.pid=p.pid and op.oid=#{oid}")
    List<Product> queryXiangQing(Integer oid);

    @Delete("delete from orders  where oid=#{oid}")
    void deleteOrders(String oid);

    @Delete("delete from orderitem  where oid=#{oid}")
    void deleteOrderItem(String oid);

    @Select("select * from  orders  o where oid=#{oid}")
    Orders queryDetailsById(Integer oid);

    @Update("update orders  set name=#{orders.name},phone=#{orders.phone},addr=#{orders.addr} where oid=#{orders.oid} ")
    void updateOrder(@Param("orders") Orders orders);

    @Update("update orders  set state = 1  where oid=#{oid} ")
    void updateOrderById(Integer oid);
}

package com.jk.mapper.loginUser;

import com.jk.model.orders.Orders;
import com.jk.model.users.Users;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface LoginUserMapper {
    @Select("select * from user where username = #{username}")
    List<Users> loginUser(@Param("username") String username);

    @Select("select o.*,p.pname as pname ,p.image as pimg,p.shop_price as price  from orders o , product p , orderitem ot where o.oid = ot.oid and p.pid = ot.pid and o.uid = #{uid}")
    List<Orders> queryOrder(Integer uid);

}

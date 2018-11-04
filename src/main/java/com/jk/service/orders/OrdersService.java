package com.jk.service.orders;

import com.alibaba.dubbo.common.json.JSONObject;
import com.jk.model.orders.Orders;
import com.jk.model.orders.Product;
import com.jk.model.orders.Trees;

import java.util.List;
import java.util.Map;

public interface OrdersService {

    List<Orders> queryOrders();

    //发货
    void fahuo(Orders orders);

    //查询订单详情
    List<Product> queryXiangQing(Orders orders);

    //删除 订单表  order
    void deleteOrders(Orders orders);

    //删除 中间表 orderitme 的数据
    void deleteOrderItem(Orders orders);

    //跳转修改页面  查询对应订单信息然后回显
    Orders queryDetailsById(Orders orders);

    //修改订单
    void updateOrder(Orders orders);

    List<Trees> getSysOrganizeByParentId(Integer id);
}

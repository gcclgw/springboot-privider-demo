package com.jk.service.orders;

import com.alibaba.dubbo.common.json.JSONObject;
import com.jk.mapper.orders.OrdersMapper;
import com.jk.model.orders.Orders;
import com.jk.model.orders.Product;
import com.jk.model.orders.Trees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;


    @Override
    public List<Orders> queryOrders() {
        return ordersMapper.queryOrdersPage();
    }

    //发货
    @Override
    public void fahuo(Orders orders) {
        ordersMapper.fahuo(orders.getOid());
    }

    @Override
    public List<Product> queryXiangQing(Orders orders) {
        return ordersMapper.queryXiangQing(orders.getOid());
    }

    @Override
    public void deleteOrders(Orders orders) {
        ordersMapper.deleteOrders(orders.getOid().toString());
    }

    @Override
    public void deleteOrderItem(Orders orders) {
        ordersMapper.deleteOrderItem(orders.getOid().toString());
    }

    @Override
    public Orders queryDetailsById(Orders orders) {

        return ordersMapper.queryDetailsById(orders.getOid());

    }

    @Override
    public void updateOrder(Orders orders) {
        ordersMapper.updateOrder(orders);
    }

    @Override
    public List<Trees> getSysOrganizeByParentId(Integer id) {
        return ordersMapper.getSysOrganizeByParentId(id.toString());
    }

    @Override
    public void updateOrderById(Integer oid) {
        ordersMapper.updateOrderById(oid);
    }
}

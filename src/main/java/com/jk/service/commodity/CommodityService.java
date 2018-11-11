package com.jk.service.commodity;

import com.alibaba.fastjson.JSONObject;
import com.jk.model.ResultPage;
import com.jk.model.commodity.Categorysecond;
import com.jk.model.commodity.CommodityProperty;
import com.jk.model.commodity.Product;
import com.jk.model.orders.Orders;
import com.jk.model.users.Users;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public interface CommodityService {

    /*查询商品列表*/
    List<Product> queryCommodity();
/*删除商品*/
    void deleteCommodity(String pid);
/*动态下拉二级*/
    List<Categorysecond> querycsid();
/*新增*/
    void addCommodity(Product product);
/*根据id回显*/
    Product toupdate(Integer pid);
/*修改*/
    void updateCommodity(Product product);
/*添加属性*/
    void addtjsx(Integer pid, String cname, String cvalue);
/*商品未审核查询*/
    List<Product> queryByStatus();
/*修改状态*/
    void updateStatus(Integer pid);

    /*查询热销商品*/
    List<Product> querySell();

    /*查询最新商品*/
    List<Product> queryDate();

    /*一级分类查询*/
    List<Product> thePrimaryQuery(String cid,String csid);

    /*商品详情*/
    List<Product> queryDetails(String pid);

    /*商品属性*/
    List<CommodityProperty> queryCommodityProperty(String pid);

    /*点击量加一*/
    void updateIs_Hot(String pid);

    /**
     * 前端分页
     * @param cid
     * @param csid
     * @return
     */
    ResultPage limitProduct(Product product, String cid, String csid);

    /*查询食品*/
    List<Product> queryShopIntegral();

    /*新增订单*/
    void addOrders(Product product, Integer count, Integer uid, Orders orders);

    /*新增商品订单关联表*/
    void addOrdersitem(Product product, Integer count, Orders orders);

    /*查询关联商品*/
    Product selectProduct( Orders orders);

    /*用户信息回显*/
    Users selectUsers(Integer uid);

    /*修改订单*/
    void updateOrder(Orders orders);
    /*修改积分*/
    void updateUsers(Integer ssss,Integer userid);

    /*增加积分*/
    void addJf(Integer awards,Integer uid);
}

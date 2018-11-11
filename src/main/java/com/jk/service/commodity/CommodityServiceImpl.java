package com.jk.service.commodity;

import com.jk.mapper.commodity.CommodityMapper;
import com.jk.model.ResultPage;
import com.jk.model.commodity.Categorysecond;
import com.jk.model.commodity.CommodityProperty;
import com.jk.model.commodity.Product;
import com.jk.model.orders.Orders;
import com.jk.model.users.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CommodityMapper commodityMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    public CommodityServiceImpl() throws ParseException {
    }


    @Override
    public List<Product> queryCommodity() {
        return commodityMapper.queryCommodity();
    }

    @Override
    public void deleteCommodity(String pid) {
        commodityMapper.deleteCommodity(pid);
    }

    @Override
    public List<Categorysecond> querycsid() {
        return commodityMapper.querycsid();
    }

    @Override
    public void addCommodity(Product product) {
        product.setPdate(new Date());
        commodityMapper.addCommodity(product);
    }

    @Override
    public Product toupdate(Integer pid) {
        return commodityMapper.toupdate(pid);
    }

    @Override
    public void updateCommodity(Product product) {
        commodityMapper.updateCommodity(product);
    }

    @Override
    public void addtjsx(Integer pid, String cname, String cvalue) {
        String[] splitname = cname.split(",");
        String[] splitvalue = cvalue.split(",");
        for (int i = 0; i < splitname.length; i++){
            commodityMapper.addtjsx(pid,splitname[i],splitvalue[i]);
        }
    }

    @Override
    public List<Product> queryByStatus() {
        return commodityMapper.queryByStatus();
    }

    @Override
    public void updateStatus(Integer pid) {
        commodityMapper.updateStatus(pid);
    }

    @Override
    public List<Product> querySell() {
        return commodityMapper.querySell();
    }

    @Override
    public List<Product> queryDate() {
        List<Product> prtList = commodityMapper.queryDate();
        redisTemplate.opsForValue().set("newGoods", prtList);
        return prtList;
    }

    @Override
    public List<Product> thePrimaryQuery(String cid,String csid) {
        return commodityMapper.thePrimaryQuery(cid,csid);
    }

    @Override
    public List<Product> queryDetails(String pid) {
        return commodityMapper.queryDetails(pid);
    }

    @Override
    public List<CommodityProperty> queryCommodityProperty(String pid) {
        return commodityMapper.queryCommodityProperty(pid);
    }

    @Override
    public void updateIs_Hot(String pid) {
        commodityMapper.updateIs_Hot(pid);
    }

    /**
     * 前端分页
     * @param cid
     * @param csid
     * @return
     */
    @Override
    public ResultPage limitProduct(Product product,String cid, String csid) {
        product.calculate();
        //构建返回数据体
        ResultPage resultPage = new ResultPage();
        //查询总条数
        int count = commodityMapper.selectProductCount(product);
        resultPage.setTotal(count);
        //查询list
        List<Product> p = commodityMapper.selectProductList(product);
        resultPage.setRows(p);
        return resultPage;
    }

    @Override
    public List<Product> queryShopIntegral() {
        return commodityMapper.queryShopIntegral();
    }




    @Override
    public void addOrders(Product product, Integer count, Integer uid, Orders orders) {
        Integer price = product.getShop_price();
        int i = price * count;
        orders.setTotal(i);
        orders.setUid(uid);
      commodityMapper.addOrders(orders);
    }


    @Override
    public void addOrdersitem(Product product, Integer count, Orders orders) {
        Integer price = product.getShop_price();
        int i = price * count;
        commodityMapper.addOrdersitem(i,product,count, orders);
    }

    @Override
    public Product selectProduct(Orders orders) {
        return commodityMapper.selectProduct(orders);
    }

    @Override
    public Users selectUsers(Integer uid) {
        return commodityMapper.selectUsers(uid);
    }

    @Override
    public void updateOrder(Orders orders) {
        commodityMapper.updateOrder(orders);
    }

    @Override
    public void updateUsers(Integer ssss, Integer userid) {
        commodityMapper.updateUsers(ssss,userid);
    }

    @Override
    public void addJf(Integer awards,Integer uid) {
        commodityMapper.addJf(awards,uid);
    }


}

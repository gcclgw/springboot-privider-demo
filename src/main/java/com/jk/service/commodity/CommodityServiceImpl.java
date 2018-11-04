package com.jk.service.commodity;

import com.jk.mapper.commodity.CommodityMapper;
import com.jk.model.commodity.Categorysecond;
import com.jk.model.commodity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CommodityMapper commodityMapper;

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
        return commodityMapper.queryDate();
    }

    @Override
    public List<Product> thePrimaryQuery(String cid) {
        return commodityMapper.thePrimaryQuery(cid);
    }


}

package com.jk.service.commodity;

import com.jk.mapper.commodity.CommodityMapper;
import com.jk.model.commodity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CommodityMapper commodityMapper;

    @Override
    public List<Product> queryProduct() {
        return commodityMapper.queryProduct();
    }
}

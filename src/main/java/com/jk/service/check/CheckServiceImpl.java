package com.jk.service.check;

import com.jk.mapper.check.CheckMapper;
import com.jk.model.commodity.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CheckServiceImpl implements CheckService {

    @Autowired
    private CheckMapper checkMapper;

    @Override
    public List<Product> queryVipProduct() {
        return checkMapper.queryVipProduct();
    }

    @Override
    public void updatePro(Integer pid) {
         checkMapper.updatePro(pid);
    }
}

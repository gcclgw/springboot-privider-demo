package com.jk.service.contractx;

import com.jk.mapper.contractx.ContMapper;
import com.jk.model.cont.Contx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ContServiceImpl implements ContService {
    @Autowired
    private ContMapper contMapper;
    @Override
    public List<Contx> queryCont() {

        return contMapper.queryCont();
    }
}

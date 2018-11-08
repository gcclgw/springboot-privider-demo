package com.jk.service.timer;

import com.jk.mapper.timer.TimerMapper;
import com.jk.model.cont.Contx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimerServiceImpl implements TimerService {
   @Autowired
   private TimerMapper timerMapper;

    @Override
    public List<Contx> queryPhone() {
        return timerMapper.queryPhone();
    }

    @Override
    public List<Contx> queryEmil() {
        return timerMapper.queryEmil();
    }

    @Override
    public List<Contx> queryTel() {
        return timerMapper.queryTel();
    }

    @Override
    public List<Contx> queryCont() {
        return timerMapper.queryCont();
    }
}

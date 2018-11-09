package com.jk.service.timer;

import com.jk.model.cont.Contx;

import java.util.List;

public interface TimerService {
    List<Contx> queryPhone();
    List<Contx> queryEmil();
    List<Contx> queryTel();
    List<Contx> queryCont();

}

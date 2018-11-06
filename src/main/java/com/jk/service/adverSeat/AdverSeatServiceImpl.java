package com.jk.service.adverSeat;

import com.jk.mapper.adverSeat.AdverSeatMapper;
import com.jk.model.adver.Adver;
import com.jk.model.adverseat.Adverseat;
import com.jk.service.adver.AdverService;
import com.jk.utils.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("adverSeatService")
public class AdverSeatServiceImpl implements AdverSeatService {

    @Autowired
    private AdverSeatMapper adverSeatMapper;

    @Override
    public ResultPage selectAdverSeatList(Adverseat adverseat) {
        adverseat.calculate();
        ResultPage resultPage = new ResultPage();
        int  count = adverSeatMapper.getAdverSeatCount(adverseat);
        resultPage.setTotal(count);
        List<Adverseat> Adverseats = adverSeatMapper.selectAdverSeatList(adverseat);
        resultPage.setRows(Adverseats);
        return resultPage;
    }


}

package com.jk.service.adver;

import com.jk.mapper.adver.AdverMapper;
import com.jk.model.adver.Adver;
import com.jk.model.user.User;
import com.jk.utils.ResultPage;
import com.jk.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("adverService")
public class AdverSrviceImpl implements AdverService{

    @Autowired
    private AdverMapper adverMapper;


    @Override
    public ResultPage selectAdverList(Adver adver) {
        adver.calculate();
        ResultPage resultPage = new ResultPage();
        int  count = adverMapper.getAdverCount(adver);
        resultPage.setTotal(count);
        List<Adver> advers = adverMapper.selectAdverList(adver);
        resultPage.setRows(advers);
        return resultPage;
    }

    @Override
    public void addAdver(Adver adver) {
        adver.setAdverid(StringUtil.getUUID());
        adverMapper.addAdver(adver);
    }
}

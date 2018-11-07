package com.jk.service.timing;

import com.jk.mapper.timing.TimingMapper;
import com.jk.model.mywork.Contxract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("timingService")
public class TimingServiceImpl implements TimingService {
    @Autowired
    private TimingMapper timingMapper;


    @Override
    public List<Contxract> queryHtPhone() {
        return timingMapper.queryHtPhone();
    }
}

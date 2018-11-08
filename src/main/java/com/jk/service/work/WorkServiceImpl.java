package com.jk.service.work;

import com.jk.mapper.work.WorkMapper;
import com.jk.model.work.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkServiceImpl implements  WorkService {

    @Autowired
    private WorkMapper workMapper;

    @Override
    public void addWork(Integer htid) {
        workMapper.addWork(htid);
    }

    @Override
    public List<Work> queryWork() {
        return workMapper.queryWork();
    }

    @Override
    public void updateWork(Work work) {
        workMapper.updateWork(work);
    }

    @Override
    public void updateContXy(Integer htid) {
        workMapper.updateContXy(htid);
    }

    @Override
    public void updateContJy(Integer htid) {
        workMapper.updateContJy(htid);
    }
}

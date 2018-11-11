package com.jk.service.blacklist;

import com.jk.mapper.blacklist.BlackListMapper;
import com.jk.model.blacklist.BlackList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlackListServiceImpl implements BlackListService {
    @Autowired
    private BlackListMapper blackListMapper;

    @Override
    public List<BlackList> queryByUid(String uphone) {
        return blackListMapper.queryByUid(uphone);
    }
}

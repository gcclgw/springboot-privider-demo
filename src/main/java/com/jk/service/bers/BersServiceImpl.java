package com.jk.service.bers;

import com.jk.mapper.bers.BersMapper;
import com.jk.model.mans.Userx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("bersService")
public class BersServiceImpl implements BersService {
    @Autowired
    private BersMapper bersMapper;

    @Override
    public List<Userx> bersSelect() {
        return bersMapper.bersSelect();
    }

    @Override
    public void delDers(String uid) {
        bersMapper.delDers(uid);
    }

    @Override
    public Userx updateBers(String uid) {
        return bersMapper.updateBers(uid);
    }

    @Override
    public void updateAdds(Userx u) {
        bersMapper.updateAdds(u);
    }

    @Override
    public List<Userx> memSelect() {
        return bersMapper.memSelect();
    }

    @Override
    public void updateMen(String uid) {
        bersMapper.updateMen(uid);
    }
}

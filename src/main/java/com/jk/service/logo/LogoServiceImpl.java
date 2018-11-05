package com.jk.service.logo;

import com.jk.mapper.logo.LogoMapper;
import com.jk.model.logo.Logo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LogoServiceImpl implements LogoService {
  @Autowired
  private LogoMapper logoMapper;

    @Override
    public List<Logo> queryLogo() {
        return logoMapper.queryLogo();
    }

    @Override
    public void updateLogo(String logo) {
        logoMapper.updateLogo(logo);
    }
}

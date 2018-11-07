package com.jk.mapper.adver;

import com.jk.model.adver.Adver;

import java.util.List;

public interface AdverMapper {
    int getAdverCount(Adver adver);

    List<Adver> selectAdverList(Adver adver);

    void addAdver(Adver adver);

    List<Adver> findAdveSrById(String adverid);

}

package com.jk.mapper.adverSeat;

import com.jk.model.adverseat.Adverseat;

import java.util.List;

public interface AdverSeatMapper {
    int getAdverSeatCount(Adverseat adverseat);

    List<Adverseat> selectAdverSeatList(Adverseat adverseat);
}

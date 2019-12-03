package com.oreo.BusReservation.mapper;

import com.oreo.BusReservation.domain.Bus;

import java.sql.Timestamp;
import java.util.List;

public interface BusMapper {
    public List<Bus> allBus();
    public Bus selectedBus(int bus);
    // 버스 검색조건을 어떻게 해야할까?
    public List<Bus> selectedBusListPlace(String departure, String arrival);
    public List<Bus> selectedBusListPlaceTime(String departure, String arrival, Timestamp depart_time);
    public void insertBus(Bus bus);
    public void updateBus(Bus bus);
    public void deleteBus(int id);
}

package com.oreo.BusReservation.Repository;

import com.oreo.BusReservation.domain.Bus;
import com.oreo.BusReservation.mapper.BusMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository("busDAO")
public class BusDAO {
    @Autowired
    BusMapper busMapper;

    public List<Bus> allBus(){
        return busMapper.allBus();
    }

    public Bus selectedBus(Bus bus){
        return busMapper.selectedBus(bus);
    }

    public List<Bus> selectedBusListPlace(String departure, String arrival){
        return busMapper.selectedBusListPlace(departure,arrival);
    }

    public List<Bus> selectedBusListPlaceTime(String departure, String arrival, Timestamp depart_time, Timestamp arrive_time){
        return busMapper.selectedBusListPlaceTime(departure,arrival,depart_time,arrive_time);
    }

    public void insertBus(Bus bus){
        busMapper.insertBus(bus);
    }

    public void updateBus(Bus bus){
        busMapper.updateBus(bus);
    }

    public void deleteBus(int id){
        busMapper.deleteBus(id);
    }
}

package com.oreo.BusReservation.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oreo.BusReservation.Repository.BusDAO;
import com.oreo.BusReservation.domain.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.List;

@EnableAutoConfiguration
@RestController
public class BusController {

    @Autowired
    BusDAO busDAO;

    /*TODO : 버스에서 필요한 것
    * 모든 버스리스트 불러오기 (getAllBus)
    * 선택한 버스 정보 불러오기 (seletedBus)
    * 조건에 맞는 버스 리스트 불러오기 (selectedBusst)
    * 버스 입력 (insertBus)
    * 버스 수정 (modifyBusInfo)
     */

    @GetMapping("/bus/detail")
    public String busDetail(@RequestParam("busId") int busId) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Bus bus = busDAO.selectedBus(busId);

        return objectMapper.writeValueAsString(bus);
    }

    @GetMapping("/bus/list")
    public String busList(@RequestParam("departure") String departure,
                          @RequestParam("arrival") String arrival,
                          @RequestParam("date") Timestamp date
                          ) throws JsonProcessingException {
            ObjectMapper objectMapper = new ObjectMapper();
        List<Bus> bus = busDAO.selectedBusListPlaceTime(departure,arrival,date);

        return objectMapper.writeValueAsString(bus);
    }


}

package com.oreo.BusReservation.domain;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class Bus implements Serializable {
    int id;
    String departure;
    String arrival;
    Timestamp depart_time;
    Timestamp arrive_time;
    String type;
    String company;
}

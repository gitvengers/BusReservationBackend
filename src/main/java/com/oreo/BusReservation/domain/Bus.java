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
    int price;

    public Bus(int id, String departure, String arrival, Timestamp depart_time, Timestamp arrive_time, String type, String company, int price) {
        this.id = id;
        this.departure = departure;
        this.arrival = arrival;
        this.depart_time = depart_time;
        this.arrive_time = arrive_time;
        this.type = type;
        this.company = company;
        this.price = price;
    }

    public Bus(String departure, String arrival, Timestamp depart_time, Timestamp arrive_time, String type, String company, int price) {
        this.departure = departure;
        this.arrival = arrival;
        this.depart_time = depart_time;
        this.arrive_time = arrive_time;
        this.type = type;
        this.company = company;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

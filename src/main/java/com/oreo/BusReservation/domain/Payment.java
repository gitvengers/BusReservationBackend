package com.oreo.BusReservation.domain;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Payment {
    int id;
    int member_id;
    int ticket_id;
    Timestamp depart_time;
    String bus_company;
    int bus_price;

    public Payment(int id, int member_id, int ticket_id, Timestamp depart_time, String bus_company, int bus_price) {
        this.id = id;
        this.member_id = member_id;
        this.ticket_id = ticket_id;
        this.depart_time = depart_time;
        this.bus_company = bus_company;
        this.bus_price = bus_price;
    }

    public Payment(int member_id, int ticket_id, Timestamp depart_time, String bus_company, int bus_price) {
        this.member_id = member_id;
        this.ticket_id = ticket_id;
        this.depart_time = depart_time;
        this.bus_company = bus_company;
        this.bus_price = bus_price;
    }

}

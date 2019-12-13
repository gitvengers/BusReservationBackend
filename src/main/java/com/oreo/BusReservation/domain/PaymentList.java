package com.oreo.BusReservation.domain;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class PaymentList {
    int id;
    int member_id;
    int ticket_id;
    Timestamp depart_time;
    String bus_company;
    int bus_price;

    public PaymentList(int id, int member_id, int ticket_id, Timestamp depart_time, String bus_company, int bus_price) {
        this.id = id;
        this.member_id = member_id;
        this.ticket_id = ticket_id;
        this.depart_time = depart_time;
        this.bus_company = bus_company;
        this.bus_price = bus_price;
    }

    public PaymentList(int member_id, int ticket_id, Timestamp depart_time, String bus_company, int bus_price) {
        this.member_id = member_id;
        this.ticket_id = ticket_id;
        this.depart_time = depart_time;
        this.bus_company = bus_company;
        this.bus_price = bus_price;
    }

    public int getId() {
        return id;
    }

    public int getMember_id() {
        return member_id;
    }

    public int getTicket_id() {
        return ticket_id;
    }

    public Timestamp getDepart_time() {
        return depart_time;
    }

    public String getBus_company() {
        return bus_company;
    }

    public int getBus_price() {
        return bus_price;
    }
}

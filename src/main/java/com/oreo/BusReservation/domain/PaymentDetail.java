package com.oreo.BusReservation.domain;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class PaymentDetail {
    int ticket_id;
    int member_id;
    Timestamp bus_depart_time;
    String bus_company;
    int price;

    public PaymentDetail(int ticket_id, int member_id, Timestamp bus_depart_time, String bus_company, int price) {
        this.ticket_id = ticket_id;
        this.member_id = member_id;
        this.bus_depart_time = bus_depart_time;
        this.bus_company = bus_company;
        this.price = price;
    }

    public int getMember_id() {
        return member_id;
    }
}

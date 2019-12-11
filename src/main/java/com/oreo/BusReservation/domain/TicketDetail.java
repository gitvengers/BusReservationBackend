package com.oreo.BusReservation.domain;

import java.sql.Timestamp;

public class TicketDetail {
    int ticket_id;
    int ticket_bus_id;
    int ticket_member_id;
    int ticket_info;
    int bus_id;
    String bus_departure;
    String bus_arrival;
    Timestamp bus_depart_time;
    Timestamp bus_arrive_time;
    String bus_type;
    String bus_company;
    int bus_price;

    public TicketDetail(int ticket_id, int ticket_bus_id, int ticket_member_id, int ticket_info, int bus_id, String bus_departure, String bus_arrival, Timestamp bus_depart_time, Timestamp bus_arrive_time, String bus_type, String bus_company, int bus_price) {
        this.ticket_id = ticket_id;
        this.ticket_bus_id = ticket_bus_id;
        this.ticket_member_id = ticket_member_id;
        this.ticket_info = ticket_info;
        this.bus_id = bus_id;
        this.bus_departure = bus_departure;
        this.bus_arrival = bus_arrival;
        this.bus_depart_time = bus_depart_time;
        this.bus_arrive_time = bus_arrive_time;
        this.bus_type = bus_type;
        this.bus_company = bus_company;
        this.bus_price = bus_price;
    }

    public TicketDetail(int ticket_bus_id, int ticket_member_id, int ticket_info, String bus_departure, String bus_arrival, Timestamp bus_depart_time, Timestamp bus_arrive_time, String bus_type, String bus_company, int bus_price) {
        this.ticket_bus_id = ticket_bus_id;
        this.ticket_member_id = ticket_member_id;
        this.ticket_info = ticket_info;
        this.bus_departure = bus_departure;
        this.bus_arrival = bus_arrival;
        this.bus_depart_time = bus_depart_time;
        this.bus_arrive_time = bus_arrive_time;
        this.bus_type = bus_type;
        this.bus_company = bus_company;
        this.bus_price = bus_price;
    }

    public Timestamp getBus_depart_time() {
        return bus_depart_time;
    }

    public void setBus_depart_time(Timestamp bus_depart_time) {
        this.bus_depart_time = bus_depart_time;
    }

    public Timestamp getBus_arrive_time() {
        return bus_arrive_time;
    }

    public void setBus_arrive_time(Timestamp bus_arrive_time) {
        this.bus_arrive_time = bus_arrive_time;
    }
}

package com.oreo.BusReservation.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class Bus implements Serializable {
    int id;
    String departure;
    String arrival;
    Timestamp depart_time;
    Timestamp arrive_time;
    String type;
    String company;

    public Bus(int id, String departure, String arrival, Timestamp depart_time, Timestamp arrive_time, String type, String company) {
        this.id = id;
        this.departure = departure;
        this.arrival = arrival;
        this.depart_time = depart_time;
        this.arrive_time = arrive_time;
        this.type = type;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public Timestamp getDepart_time() {
        return depart_time;
    }

    public void setDepart_time(Timestamp depart_time) {
        this.depart_time = depart_time;
    }

    public Timestamp getArrive_time() {
        return arrive_time;
    }

    public void setArrive_time(Timestamp arrive_time) {
        this.arrive_time = arrive_time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + id +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", depart_time=" + depart_time +
                ", arrive_time=" + arrive_time +
                ", type='" + type + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}

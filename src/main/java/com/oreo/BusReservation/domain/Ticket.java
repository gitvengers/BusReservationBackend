package com.oreo.BusReservation.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class Ticket implements Serializable {
    int id;
    int bus_id;
    int member_id;
    int info;

    public Ticket(int id, int bus_id, int member_id, int info) {
        this.id = id;
        this.bus_id = bus_id;
        this.member_id = member_id;
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBus_id() {
        return bus_id;
    }

    public void setBus_id(int bus_id) {
        this.bus_id = bus_id;
    }

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", bus_id=" + bus_id +
                ", member_id=" + member_id +
                ", info=" + info +
                '}';
    }
}

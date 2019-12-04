package com.oreo.BusReservation.domain;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class Ticket implements Serializable {
    int id;
    int bus_id;
    int member_id;
    int info;
}

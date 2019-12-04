package com.oreo.BusReservation.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Administrator implements Serializable {
    int id;
    String admin_id;
    String admin_pw;
}

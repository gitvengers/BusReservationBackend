package com.oreo.BusReservation.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Administrator implements Serializable {
    int id;
    String admin_id;
    String admin_pw;

    public Administrator(int id, String admin_id, String admin_pw) {
        this.id = id;
        this.admin_id = admin_id;
        this.admin_pw = admin_pw;
    }

    public Administrator(String admin_id, String admin_pw) {
        this.admin_id = admin_id;
        this.admin_pw = admin_pw;
    }
}

package com.oreo.BusReservation.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class Administrator implements Serializable {
   int id;
   String admin_id;
   String admin_pw;

    public Administrator(int id, String admin_id, String admin_pw) {
        this.id = id;
        this.admin_id = admin_id;
        this.admin_pw = admin_pw;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_pw() {
        return admin_pw;
    }

    public void setAdmin_pw(String admin_pw) {
        this.admin_pw = admin_pw;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "id=" + id +
                ", admin_id='" + admin_id + '\'' +
                ", admin_pw='" + admin_pw + '\'' +
                '}';
    }
}

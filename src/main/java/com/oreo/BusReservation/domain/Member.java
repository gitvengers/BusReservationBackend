package com.oreo.BusReservation.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Member implements Serializable {
    int id;
    String user_id;
    String user_pw;
    String name;
    String email;

    public Member(int id, String user_id, String user_pw, String name, String email) {
        this.id = id;
        this.user_id = user_id;
        this.user_pw = user_pw;
        this.name = name;
        this.email = email;
    }

    public Member(String userid, String userpwd) {
        user_id = userid;
        user_pw = userpwd;
    }

    public Member(String user_id, String user_pw, String name, String email) {
        this.user_id = user_id;
        this.user_pw = user_pw;
        this.name = name;
        this.email = email;
    }
}

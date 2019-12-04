package com.oreo.BusReservation.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Member implements Serializable {
    int id;

    String user_id;
    String user_pwd;
    String name;
    String email;

    public Member(String userid, String userpwd) {
        user_id = userid;
        user_pwd = userpwd;
    }
}

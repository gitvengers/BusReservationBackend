package com.oreo.BusReservation.domain;

import java.io.Serializable;

public class Member implements Serializable {
    int id;
    String user_id;
    String user_pwd;
    String name;
    String email;

    public Member(){}

    public Member(int id, String name, String user_id, String user_pwd, String email, int authority, String number) {
        this.id = id;
        this.name = name;
        this.user_id = user_id;
        this.user_pwd = user_pwd;
        this.email = email;
    }

    // 일반적인 멤버 생성
    public Member(String name, String user_id, String user_pwd, String email, String number) {
        this.name = name;
        this.user_id = user_id;
        this.user_pwd = user_pwd;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", user_id='" + user_id + '\'' +
                ", user_pwd='" + user_pwd + '\'' +
                ", email='" + email + '\'' +
                "}\n";
    }
}

package com.oreo.BusReservation.mapper;

import com.oreo.BusReservation.domain.Administrator;
import com.oreo.BusReservation.domain.Member;

public interface AdminMapper {
    public Administrator selectedAdmin(Administrator admin);
    public void insertAdmin(Administrator admin);
    public void updateAdmin(Administrator admin);
    public void deleteAdmin(int id);
    public Member selectAllMembers();
}
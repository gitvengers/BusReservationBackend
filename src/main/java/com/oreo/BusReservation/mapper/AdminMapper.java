package com.oreo.BusReservation.mapper;

import com.oreo.BusReservation.domain.Administrator;

public interface AdminMapper {
    public Administrator selectedAdmin(String aid);
    public void insertAdmin(Administrator admin);
    public void updateAdmin(Administrator admin);
    public void deleteAdmin(int id);

}
package com.oreo.BusReservation.Repository;

import com.oreo.BusReservation.domain.Administrator;
import com.oreo.BusReservation.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("adminDAO")
public class AdminDAO {

    @Autowired
    AdminMapper adminMapper;

    public Administrator selectAdmin(int id){
        return adminMapper.selectedAdmin(id);
    }

    public void insertAdmin(Administrator admin){
        adminMapper.insertAdmin(admin);
    }

    public void updateAdmin(Administrator admin){
        adminMapper.updateAdmin(admin);
    }

    public void deleteAdmin(int id){
        adminMapper.deleteAdmin(id);
    }
}

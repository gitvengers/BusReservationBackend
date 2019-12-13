package com.oreo.BusReservation.Repository;

import com.oreo.BusReservation.domain.Administrator;
import com.oreo.BusReservation.domain.Member;
import com.oreo.BusReservation.mapper.AdminMapper;
import com.oreo.BusReservation.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdminDAO {

    @Autowired
    AdminMapper adminMapper;

    @Autowired
    MemberMapper memberMapper;

    public Administrator selectedAdmin(Administrator administrator) {
        return adminMapper.selectedAdmin(administrator);
    }
    public void insertAdmin(Administrator admin) {
        adminMapper.insertAdmin(admin);
    }
    public void updateAdmin(Administrator admin) {
        adminMapper.updateAdmin(admin);
    }
    public void deleteAdmin(int id) {
        adminMapper.deleteAdmin(id);
    }
    public List<Member> selectAllMembers(){
        return memberMapper.allMembers();

    }
}

package com.oreo.BusReservation.mapper;

import com.oreo.BusReservation.domain.Bus;
import com.oreo.BusReservation.domain.Member;

import java.util.List;

public interface MemberMapper {
    public List<Member> allMembers();
    public Member selectedMember(int id);
    public void insertMember(Member member);
    public void updateMember(Member member);
    public void deleteMember(int id);
}
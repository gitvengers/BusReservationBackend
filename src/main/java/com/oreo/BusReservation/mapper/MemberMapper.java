package com.oreo.BusReservation.mapper;

import com.oreo.BusReservation.domain.Bus;
import com.oreo.BusReservation.domain.Member;

import java.util.List;

public interface MemberMapper {
    public List<Member> allMembers();
    public Member selectMember(String uid);
    public void insertMember(Member member);
    public void updateMemeber(Member member);
    public void delteMember(int id);
}
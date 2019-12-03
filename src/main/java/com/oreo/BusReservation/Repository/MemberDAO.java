package com.oreo.BusReservation.Repository;

import com.oreo.BusReservation.domain.Member;
import com.oreo.BusReservation.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("memberDAO")
public class MemberDAO {
    @Autowired
    MemberMapper memberMapper;

    public List<Member> allMembers(){
        return memberMapper.allMembers();
    }
    public Member selectedMember(int id){
        return memberMapper.selectedMember(id);
    }
    public void insertMember(Member member){
        memberMapper.insertMember(member);
    }
    public void updateMember(Member member){
        memberMapper.updateMember(member);
    }
    public void deleteMember(int id){
        memberMapper.deleteMember(id);
    }

}

package com.oreo.BusReservation.Controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oreo.BusReservation.Repository.AdminDAO;
import com.oreo.BusReservation.Repository.BusDAO;
import com.oreo.BusReservation.Repository.MemberDAO;
import com.oreo.BusReservation.domain.Administrator;
import com.oreo.BusReservation.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.List;

@EnableAutoConfiguration
@RestController
public class MemberController {
    @Autowired
    MemberDAO memberDAO;
    @Autowired
    AdminDAO adminDAO;

    @GetMapping("/user/login")
    public String loginInApp(@RequestParam("userID") String userid,
                              @RequestParam("userPWD") String userpwd) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        Member member = new Member(userid,userpwd);
        Member seletedMember = memberDAO.selectedMember(member);

        return objectMapper.writeValueAsString(seletedMember);
    }

    @PostMapping("/user/signup")
    public String signUp(@RequestParam("userID") String userid,
                         @RequestParam("userPWD") String userpwd,
                         @RequestParam("name") String name,
                             @RequestParam("email") String email) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Member member = new Member(userid,userpwd,name,email);
        boolean isSuccess = false;
        try{
            memberDAO.insertMember(member);
            isSuccess = true;
        }
        catch (Exception e){
            System.out.println("SignUp Failed");
        }

        return objectMapper.writeValueAsString(isSuccess);
    }

    @GetMapping("/payment/list")
    public String userPaymentMethod(@RequestParam("member_id") int member_id){
        //TODO : payment 내역 일시적으로 저장해둘 것.
        System.out.println("todo");

        return "";
    }

    // Admin Controller
    @GetMapping("/admin/memeber/list") // 관리자 권한 : 모든 유저 목록 불러오기
    public String returnAllMembers() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Member> members = adminDAO.selectAllMembers();

        return objectMapper.writeValueAsString(members);
    }

    @GetMapping("/admin/login") // 관리자 로그인
    public String adminLogin(@RequestParam("adminID") String adminid,
                             @RequestParam("adminPWD") String adminpwd) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        Administrator administrator = new Administrator(adminid,adminpwd);

        return objectMapper.writeValueAsString(adminDAO.selectedAdmin(administrator));
    }
}

package com.oreo.BusReservation.Controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oreo.BusReservation.Repository.MemberDAO;
import com.oreo.BusReservation.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class MemberController {
    @Autowired
    MemberDAO memberDAO;


    @GetMapping("/user/login")
    public String loginInApp(@RequestParam("userID") String userid,
                              @RequestParam("userPWD") String userpwd) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        Member member = new Member(userid,userpwd);
        Member seletedMember = memberDAO.selectedMember(member);

        return objectMapper.writeValueAsString(seletedMember);
    }
}

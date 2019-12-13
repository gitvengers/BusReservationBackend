package com.oreo.BusReservation.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.oreo.BusReservation.Repository.BusDAO;
import com.oreo.BusReservation.Repository.MemberDAO;
import com.oreo.BusReservation.Repository.PaymentListDAO;
import com.oreo.BusReservation.Repository.TicketDAO;
import com.oreo.BusReservation.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@EnableAutoConfiguration
@RestController
public class PaymentListController {
    List<PaymentList> paymentLists = new ArrayList<>();

    @Autowired
    TicketDAO ticketDAO;

    @Autowired
    MemberDAO memberDAO;

    @Autowired
    BusDAO busDAO;

    @Autowired
    PaymentListDAO paymentDAO;

    @GetMapping("/payment/list")
    public String selectPaymentList(int member_id) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<PaymentList> returnList = new ArrayList<>();

        for (int i=0;i<paymentLists.size();i++){
            if(paymentLists.get(i).getMember_id() == member_id){
                returnList.add(paymentLists.get(i));
            }
        }
        return objectMapper.writeValueAsString(returnList);
    }

    @PostMapping("/payment/insert")
    public String createPayment(@RequestParam("member_id")int member_id,
                                @RequestParam("bus_id")int bus_id
                                ){
        // 필요한 파라미터 id, payment_date, ticket_id, member_id, price
        ObjectMapper objectMapper = new ObjectMapper();
        Member member = memberDAO.selectMemberId(member_id);
        Bus bus = busDAO.selectedBus(bus_id);
        List<TicketDetail> tickets = ticketDAO.ticketDetail(member_id);
        SimpleDateFormat formatter = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
        Calendar cal = Calendar.getInstance();
        String today = null;
        today = formatter.format(cal.getTime());

        int p_id = paymentLists.size()+1;
        Timestamp payment_date = Timestamp.valueOf(today);
        int ticket_id;
        for (int i=0;i<tickets.size();i++){
            if(member_id == tickets.get(i).getTicket_member_id() && bus_id == tickets.get(i).getBus_id()){
                ticket_id = tickets.get(i).getTicket_id();
            }
        }
        int price = bus.getPrice();

        return "success";
    }
}

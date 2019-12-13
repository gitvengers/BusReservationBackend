package com.oreo.BusReservation.Controller;

import com.google.gson.Gson;
import com.oreo.BusReservation.Repository.PaymentListDAO;
import com.oreo.BusReservation.Repository.TicketDAO;
import com.oreo.BusReservation.domain.Ticket;
import com.oreo.BusReservation.domain.TicketDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@EnableAutoConfiguration
@RestController
public class TicketController {
    @Autowired
    TicketDAO ticketDAO;

    @Autowired
    PaymentListDAO paymentDAO;

    @GetMapping("ticket/list")
    public String getTicketList(@RequestParam("member_id") int memberId) {
        Gson gson = new Gson();
        return gson.toJson(ticketDAO.ticketDetail(memberId));
    }

    @PostMapping("ticket/insert")
    public String insertTicket(@RequestParam("bus_id") int bus_id,
                               @RequestParam("member_id") int member_id,
                               @RequestParam("info") int info){
        Ticket ticket = new Ticket(bus_id,member_id,info);
        boolean isSuccess = false;

        try{
            ticketDAO.insertTicket(ticket);
            isSuccess = true;
        }
        catch (Exception e){
            System.out.println("ticketing failed");
        }
        Gson gson = new Gson();
        return gson.toJson(isSuccess);
    }
    @PostMapping("ticket/register")
    public String registerTicket(@RequestParam("bus_id") int bus_id,
                                 @RequestParam("member_id") int member_id){
        int before_info = ticketDAO.countTicket(bus_id);
        return this.insertTicket(bus_id,member_id,before_info+1);
    }

    @GetMapping("ticket/detail")
    public String getTicketDetail(@RequestParam("id") int id){
        Gson gson = new Gson();
        return gson.toJson(ticketDAO.ticketDetail(id));
    }
}

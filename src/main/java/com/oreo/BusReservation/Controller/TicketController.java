package com.oreo.BusReservation.Controller;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.oreo.BusReservation.Repository.TicketDAO;
import com.oreo.BusReservation.domain.Ticket;
import com.oreo.BusReservation.domain.TicketDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spring.web.json.Json;

import java.util.List;

@EnableAutoConfiguration
@RestController
public class TicketController {
    @Autowired
    TicketDAO ticketDAO;

    @GetMapping("ticket/list")
    public String getTicketList(@RequestParam("member_id") int memberId) {
        List<Ticket> tickets = ticketDAO.selectedTickets(memberId);
        Gson gson = new Gson();
        return gson.toJson(tickets);
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

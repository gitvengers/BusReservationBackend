package com.oreo.BusReservation.Controller;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.oreo.BusReservation.Repository.TicketDAO;
import com.oreo.BusReservation.domain.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spring.web.json.Json;

import java.util.List;

@EnableAutoConfiguration
@RestController
@Controller
public class TicketController {
    @Autowired
    TicketDAO ticketDAO;

    @GetMapping("ticket/list")
    public String getTicketList(@RequestParam("member_id") int memberId) {
        List<Ticket> tickets = ticketDAO.selectedTickets(memberId);
        Gson gson = new Gson();
        return gson.toJson(tickets);
    }

    @GetMapping("ticket/detail")
    public String getTicketDetail(@RequestParam("id") int id) {
        Ticket ticket = ticketDAO.selectedTicket(id);
        Gson gson = new Gson();
        return gson.toJson(ticket);
    }
}

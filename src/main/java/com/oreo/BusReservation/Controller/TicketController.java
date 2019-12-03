package com.oreo.BusReservation.Controller;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.oreo.BusReservation.Repository.TicketDAO;
import com.oreo.BusReservation.domain.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class TicketController {
    @Autowired
    TicketDAO ticketDAO;

    @GetMapping("ticket/list")
    public JsonArray getTicketList(@RequestParam("member_id") int memberId) {
        List<Ticket> tickets = ticketDAO.selectedTickets(memberId);

        Gson gson = new Gson();
        JsonElement element = gson.toJsonTree(tickets, new TypeToken<List<Ticket>>(){}.getType());
        return element.getAsJsonArray();
    }
}

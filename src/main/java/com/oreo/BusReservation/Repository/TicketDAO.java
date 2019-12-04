package com.oreo.BusReservation.Repository;


import com.oreo.BusReservation.domain.Ticket;
import com.oreo.BusReservation.mapper.TicketMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TicketDAO {
    @Autowired
    TicketMapper ticketMapper;

    public void insertTicket(Ticket ticket) {
        ticketMapper.insertTicket(ticket);
    }
    public Ticket selectedTicket(int id) {
        return ticketMapper.selectedTicket(id);
    }
    public List<Ticket> selectedTickets(int memberId) {
        return ticketMapper.selectedTickets(memberId);
    }
    public void updateTicket(Ticket ticket) {
        ticketMapper.updateTicket(ticket);
    }
    public void deleteTicket(int id) {
        ticketMapper.deleteTicket(id);
    }
}

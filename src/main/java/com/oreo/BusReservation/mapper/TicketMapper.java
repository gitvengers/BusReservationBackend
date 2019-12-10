package com.oreo.BusReservation.mapper;

import com.oreo.BusReservation.domain.Ticket;
import com.oreo.BusReservation.domain.TicketDetail;

import java.util.List;

public interface TicketMapper {
    public void insertTicket(Ticket ticket);
    public Ticket selectedTicket(int id);
    public List<Ticket> selectedTickets(int memberId);
    public void updateTicket(Ticket ticket);
    public void deleteTicket(int id);
    public TicketDetail ticketDetail(int id);
    public int countTicket(int bus_id);
}

package com.oreo.BusReservation.mapper;

import com.oreo.BusReservation.domain.Ticket;

import java.util.List;

public interface TicketMapper {
    public void insertTicket(Ticket ticket);
    public Ticket selectedTicket(int id);
    public List<Ticket> selectedTickets(List<Integer> tickets);
    public void updateTicket(Ticket ticket);
    public void deleteTicket(int id);
}

package com.oreo.BusReservation.mapper;

import com.oreo.BusReservation.domain.Ticket;

public interface TicketMapper {
    public void insertTicket(Ticket ticket);
    public void updateTicket(Ticket ticket);
    public void deleteTicket(int id);
}

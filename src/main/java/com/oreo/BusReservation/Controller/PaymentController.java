package com.oreo.BusReservation.Controller;

import com.oreo.BusReservation.Repository.PaymentDAO;
import com.oreo.BusReservation.Repository.TicketDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;

@EnableAutoConfiguration
@RestController
public class PaymentController {
    @Autowired
    TicketDAO ticketDAO;

    @Autowired
    PaymentDAO paymentDAO;

    @GetMapping("/payment/list")
    public String selectPaymentList(int member_id){


        return "";
    }
}

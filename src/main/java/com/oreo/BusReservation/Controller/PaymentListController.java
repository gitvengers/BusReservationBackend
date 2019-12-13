package com.oreo.BusReservation.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.oreo.BusReservation.Repository.PaymentListDAO;
import com.oreo.BusReservation.Repository.TicketDAO;
import com.oreo.BusReservation.domain.TicketDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;

@EnableAutoConfiguration
@RestController
public class PaymentListController {
    @Autowired
    TicketDAO ticketDAO;

    @Autowired
    PaymentListDAO paymentDAO;

    @GetMapping("/payment/list")
    //TODO : 여기 에러남...
    public String selectPaymentList(int member_id) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(paymentDAO.selectPaymentList(member_id));
    }
}

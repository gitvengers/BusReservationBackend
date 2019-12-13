package com.oreo.BusReservation.Controller;

<<<<<<< HEAD:src/main/java/com/oreo/BusReservation/Controller/PaymentListController.java
import com.fasterxml.jackson.core.JsonProcessingException;
import com.oreo.BusReservation.Repository.PaymentListDAO;
=======
import com.google.gson.Gson;
import com.oreo.BusReservation.Repository.PaymentDAO;
>>>>>>> dev:src/main/java/com/oreo/BusReservation/Controller/PaymentController.java
import com.oreo.BusReservation.Repository.TicketDAO;
import com.oreo.BusReservation.domain.PaymentDetail;
import com.oreo.BusReservation.domain.TicketDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@EnableAutoConfiguration
@RestController
public class PaymentListController {
    @Autowired
    TicketDAO ticketDAO;

    @Autowired
    PaymentListDAO paymentDAO;

    @GetMapping("/payment/list")
<<<<<<< HEAD:src/main/java/com/oreo/BusReservation/Controller/PaymentListController.java
    //TODO : 여기 에러남...
    public String selectPaymentList(int member_id) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(paymentDAO.selectPaymentList(member_id));
=======
    public String selectPaymentList(int member_id){
        List<PaymentDetail> paymentDetails = new ArrayList<>();
        List<PaymentDetail> returnList = new ArrayList<>();
        paymentDetails.add(new PaymentDetail(1,1,Timestamp.valueOf("2019-12-14 12:00:00"),"금남고속",10000));
        paymentDetails.add(new PaymentDetail(2,1,Timestamp.valueOf("2019-12-14 12:00:00"),"금남고속",10000));
        paymentDetails.add(new PaymentDetail(3,1,Timestamp.valueOf("2019-12-14 12:00:00"),"금남고속",10000));
        paymentDetails.add(new PaymentDetail(4,1,Timestamp.valueOf("2019-12-14 12:00:00"),"금남고속",10000));
        paymentDetails.add(new PaymentDetail(5,1,Timestamp.valueOf("2019-12-14 12:00:00"),"금남고속",10000));
        Gson gson = new Gson();
        for (int i=0;i<paymentDetails.size();i++) {
            if(member_id == paymentDetails.get(i).getMember_id()){
                returnList.add(paymentDetails.get(i));
            }
        }
        return gson.toJson(returnList);
>>>>>>> dev:src/main/java/com/oreo/BusReservation/Controller/PaymentController.java
    }
}

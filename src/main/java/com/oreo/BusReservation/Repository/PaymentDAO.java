package com.oreo.BusReservation.Repository;

import com.oreo.BusReservation.domain.Payment;
import com.oreo.BusReservation.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PaymentDAO {
    @Autowired
    PaymentMapper paymentMapper;

    public void insertPaymentList(Payment payment){
        paymentMapper.insertPaymentList(payment);
    }
    public List<Payment> selectPaymentList(int member_id){
        return paymentMapper.selectPaymentList(member_id);

    }
}

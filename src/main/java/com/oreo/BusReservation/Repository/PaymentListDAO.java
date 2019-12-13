package com.oreo.BusReservation.Repository;

import com.oreo.BusReservation.domain.PaymentList;
import com.oreo.BusReservation.mapper.PaymentListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PaymentListDAO {
    @Autowired
    PaymentListMapper paymentMapper;

    public void insertPaymentList(PaymentList payment){
        paymentMapper.insertPaymentList(payment);
    }
    public List<PaymentList> selectPaymentList(int member_id){
        return paymentMapper.selectPaymentList(member_id);
    }
}

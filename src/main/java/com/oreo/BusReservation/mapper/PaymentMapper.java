package com.oreo.BusReservation.mapper;

import com.oreo.BusReservation.domain.Payment;

import java.util.List;

public interface PaymentMapper {
    public void insertPaymentList(Payment payment);
    public List<Payment> selectPaymentList(int member_id);
}

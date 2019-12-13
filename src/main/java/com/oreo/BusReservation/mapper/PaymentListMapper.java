package com.oreo.BusReservation.mapper;

import com.oreo.BusReservation.domain.PaymentList;

import java.util.List;

public interface PaymentListMapper {
    public void insertPaymentList(PaymentList payment);
    public List<PaymentList> selectPaymentList(int member_id);
}

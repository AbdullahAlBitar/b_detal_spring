package com.aywh.b_detal_spring.mappers.impl;

import com.aywh.b_detal_spring.domain.Payment;
import com.aywh.b_detal_spring.domain.dto.PaymentDto;
import com.aywh.b_detal_spring.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentMapper implements Mapper<Payment, PaymentDto> {

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public PaymentDto mapTo(Payment payment) {
        return modelMapper.map(payment, PaymentDto.class);
    }

    @Override
    public Payment mapFrom(PaymentDto paymentDto) {
        return modelMapper.map(paymentDto, Payment.class);
    }
}

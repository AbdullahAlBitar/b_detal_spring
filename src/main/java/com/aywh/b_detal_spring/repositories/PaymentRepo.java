package com.aywh.b_detal_spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aywh.b_detal_spring.domain.Payment;

@Repository
public interface PaymentRepo extends CrudRepository<Payment, Long> {
    
}

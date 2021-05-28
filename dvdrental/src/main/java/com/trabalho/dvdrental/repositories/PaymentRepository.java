package com.trabalho.dvdrental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trabalho.dvdrental.entities.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}

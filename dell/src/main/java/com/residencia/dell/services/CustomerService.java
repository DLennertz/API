package com.residencia.dell.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.dell.entities.Customers;
import com.residencia.dell.repositories.CustomersRepository;

@Service
public class CustomerService {
	@Autowired CustomersRepository customersRepository;
	
	public Customers findById(Integer id) {
		return customersRepository.getById(id);
	}
	
	public List<Customers> findAll(){
		return customersRepository.findAll();
	}
	
	public Long count() {
		return customersRepository.count();
	}
	
	public Customers save(Customers customer) {
		return customersRepository.save(customer);
	}
	
	public Customers update(Customers customer) {
		Customers antigoCustomers = customersRepository.getById(customer.getCustomerId());
		antigoCustomers = customer;
		return customersRepository.save(antigoCustomers);
	}
}

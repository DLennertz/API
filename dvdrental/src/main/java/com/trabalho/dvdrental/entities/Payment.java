package com.trabalho.dvdrental.entities;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="payment")
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="payment_id")
	private Integer paymentID;
	
	@OneToOne
	@JoinColumn (name="customer_id", referencedColumnName="customer_id")
	private Customer customer;
	
	@OneToOne
	@JoinColumn (name="staff_id", referencedColumnName="staff_id")
	private Staff staff;
	
	@OneToOne
	@JoinColumn (name="rental_id", referencedColumnName="rental_id")
	private Rental rental;
	
	@Column (name="amount")
	private BigDecimal paymentAmount;
	
	@Column (name="payment_date")
	private Calendar paymentDate;
	
}

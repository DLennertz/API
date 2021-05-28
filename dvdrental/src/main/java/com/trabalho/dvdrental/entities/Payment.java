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

	public Integer getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(Integer paymentID) {
		this.paymentID = paymentID;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public Rental getRental() {
		return rental;
	}

	public void setRental(Rental rental) {
		this.rental = rental;
	}

	public BigDecimal getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(BigDecimal paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public Calendar getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Calendar paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	
	
}

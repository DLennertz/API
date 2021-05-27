package com.trabalho.dvdrental.entities;

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
@Table (name="rental")
public class Rental {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="rental_id")
	private Integer rentalID;
	
	@Column (name="rental_date")
	private Calendar rentalDate;
	
	@OneToOne
	@JoinColumn (name="inventory_id",referencedColumnName="inventory_id")
	private Inventory inventory;
	
	@OneToOne
	@JoinColumn (name="customer_id",referencedColumnName="customer_id")
	private Customer customer;
	
	@Column (name="return_date")
	private Calendar rentalReturnDate;
	
	@OneToOne
	@JoinColumn (name="staff_id",referencedColumnName="staff_id")
	private Staff staff;
	
	@Column (name="last_update")
	private Calendar rentalLastUpdate;
}

package com.trabalho.dvdrental.entities;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="customer_id")
	private Integer customerID;
	
	@Column (name="store_id")
	private Integer customerStoreID;
	
	@Column (name="first_name")
	private String customerFirstName;
	
	@Column (name="last_name")
	private String customerLastName;
	
	@Column (name="email")
	private String customerEmail;
	
	@OneToOne
	@JoinColumn (name="address_id", referencedColumnName="address_id")
	private Address address;
	
	@Column (name="activebool")
	private boolean customerActiveBool;
	
	@Column (name="create_date")
	private Calendar customerCreateDate;
	
	@Column (name="last_Update")
	private Calendar customerLastUpdate;
	
	@Column (name="active")
	private Integer active;
	
	@OneToOne (mappedBy="customer")
	private Rental rental;
	
	@OneToMany (mappedBy="customer")
	private List<Payment> listPayment;
}

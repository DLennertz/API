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
@Table (name="staff")
public class Staff {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="staff_id")
	private Integer staffID;
	
	@Column (name="first_name")
	private String staffFirstName;
	
	@Column (name="last_name")
	private String staffLastName;
	
	@OneToOne
	@JoinColumn (name="address_id", referencedColumnName="address_id")
	private Address address;
	
	@Column (name="email")
	private String staffEmail;
	
	@OneToOne
	@JoinColumn (name="store_id", referencedColumnName="store_id")
	private Store store;
	
	@Column (name="active")
	private boolean staffActive;
	
	@Column (name="username")
	private String staffUsername;
	
	@Column (name="password")
	private String staffPassword;
	
	@Column (name="last_update")
	private Calendar staffLastUpdate;
	
	@Column (name="picture")
	private byte staffPicture;
	
	@OneToMany(mappedBy="staff")
	private List<Payment> listPayment;
	
	@OneToMany(mappedBy="staff")
	private List<Rental> listRental;
}

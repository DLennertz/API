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
@Table (name="address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="address_id")
	private Integer addressID;
	
	@Column (name="address")
	private String addressAddress;
	
	@Column (name="address2")
	private String addressAddress2;
	
	@Column (name="district")
	private String addressDistrict;
	
	@OneToOne
	@JoinColumn (name="city_id", referencedColumnName="city_id")
	private City city;
	
	@Column (name="posta_code")
	private String addressPostalCode;
	
	@Column (name="phone")
	private String addressPhone;
	
	@Column (name="last_update")
	private Calendar addressLastUpdate;
	
	@OneToMany (mappedBy="address")
	private List<Staff> listStaff;
	
	@OneToMany (mappedBy="address")
	private List<Store> listStore;
	
	@OneToMany (mappedBy="address")
	private List<Customer> listCostumer;
}

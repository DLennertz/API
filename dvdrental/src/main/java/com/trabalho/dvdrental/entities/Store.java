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
@Table (name="store")
public class Store {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="store_id")
	private Integer storeID;
	
	@OneToOne
	@JoinColumn (name="address_id", referencedColumnName="address_id")
	private Address address;
	
	@OneToOne
	@JoinColumn (name="manager_staff_id", referencedColumnName="staff_id")
	private Staff staff;
	
	@Column (name="last_update")
	private Calendar storeLastUpdate;
	
	@OneToMany(mappedBy="store")
	private List<Staff> listStaff;
	
}

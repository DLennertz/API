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

	public Integer getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Integer customerID) {
		this.customerID = customerID;
	}

	public Integer getCustomerStoreID() {
		return customerStoreID;
	}

	public void setCustomerStoreID(Integer customerStoreID) {
		this.customerStoreID = customerStoreID;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public boolean isCustomerActiveBool() {
		return customerActiveBool;
	}

	public void setCustomerActiveBool(boolean customerActiveBool) {
		this.customerActiveBool = customerActiveBool;
	}

	public Calendar getCustomerCreateDate() {
		return customerCreateDate;
	}

	public void setCustomerCreateDate(Calendar customerCreateDate) {
		this.customerCreateDate = customerCreateDate;
	}

	public Calendar getCustomerLastUpdate() {
		return customerLastUpdate;
	}

	public void setCustomerLastUpdate(Calendar customerLastUpdate) {
		this.customerLastUpdate = customerLastUpdate;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	public Rental getRental() {
		return rental;
	}

	public void setRental(Rental rental) {
		this.rental = rental;
	}

	public List<Payment> getListPayment() {
		return listPayment;
	}

	public void setListPayment(List<Payment> listPayment) {
		this.listPayment = listPayment;
	}
	
	
}

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

	public Integer getStaffID() {
		return staffID;
	}

	public void setStaffID(Integer staffID) {
		this.staffID = staffID;
	}

	public String getStaffFirstName() {
		return staffFirstName;
	}

	public void setStaffFirstName(String staffFirstName) {
		this.staffFirstName = staffFirstName;
	}

	public String getStaffLastName() {
		return staffLastName;
	}

	public void setStaffLastName(String staffLastName) {
		this.staffLastName = staffLastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getStaffEmail() {
		return staffEmail;
	}

	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public boolean isStaffActive() {
		return staffActive;
	}

	public void setStaffActive(boolean staffActive) {
		this.staffActive = staffActive;
	}

	public String getStaffUsername() {
		return staffUsername;
	}

	public void setStaffUsername(String staffUsername) {
		this.staffUsername = staffUsername;
	}

	public String getStaffPassword() {
		return staffPassword;
	}

	public void setStaffPassword(String staffPassword) {
		this.staffPassword = staffPassword;
	}

	public Calendar getStaffLastUpdate() {
		return staffLastUpdate;
	}

	public void setStaffLastUpdate(Calendar staffLastUpdate) {
		this.staffLastUpdate = staffLastUpdate;
	}

	public byte getStaffPicture() {
		return staffPicture;
	}

	public void setStaffPicture(byte staffPicture) {
		this.staffPicture = staffPicture;
	}

	public List<Payment> getListPayment() {
		return listPayment;
	}

	public void setListPayment(List<Payment> listPayment) {
		this.listPayment = listPayment;
	}

	public List<Rental> getListRental() {
		return listRental;
	}

	public void setListRental(List<Rental> listRental) {
		this.listRental = listRental;
	}
	
	
}

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

	public Integer getRentalID() {
		return rentalID;
	}

	public void setRentalID(Integer rentalID) {
		this.rentalID = rentalID;
	}

	public Calendar getRentalDate() {
		return rentalDate;
	}

	public void setRentalDate(Calendar rentalDate) {
		this.rentalDate = rentalDate;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Calendar getRentalReturnDate() {
		return rentalReturnDate;
	}

	public void setRentalReturnDate(Calendar rentalReturnDate) {
		this.rentalReturnDate = rentalReturnDate;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public Calendar getRentalLastUpdate() {
		return rentalLastUpdate;
	}

	public void setRentalLastUpdate(Calendar rentalLastUpdate) {
		this.rentalLastUpdate = rentalLastUpdate;
	}
	
	
}

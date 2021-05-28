package com.trabalho.dvdrental.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="inventory")
public class Inventory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="inventory_id")
	private Integer inventoryID;
	
	@ManyToOne
	@JoinColumn (name="film_id", referencedColumnName="film_id")
	private Film film;
	
	@Column (name="store_id")
	private Integer inventoryStoreID;
	
	@Column (name="last_update")
	private Calendar inventoryLastUpdate;
	
	@OneToOne (mappedBy="inventory")
	private Rental rental;

	public Integer getInventoryID() {
		return inventoryID;
	}

	public void setInventoryID(Integer inventoryID) {
		this.inventoryID = inventoryID;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Integer getInventoryStoreID() {
		return inventoryStoreID;
	}

	public void setInventoryStoreID(Integer inventoryStoreID) {
		this.inventoryStoreID = inventoryStoreID;
	}

	public Calendar getInventoryLastUpdate() {
		return inventoryLastUpdate;
	}

	public void setInventoryLastUpdate(Calendar inventoryLastUpdate) {
		this.inventoryLastUpdate = inventoryLastUpdate;
	}

	public Rental getRental() {
		return rental;
	}

	public void setRental(Rental rental) {
		this.rental = rental;
	}
	
	
}

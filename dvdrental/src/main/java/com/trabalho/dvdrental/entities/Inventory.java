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
}

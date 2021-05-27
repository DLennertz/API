package com.trabalho.dvdrental.entities;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="country")
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="country_id")
	private Integer countryID;
	
	@Column (name="country")
	private String countryName;
	
	@Column (name="last_update")
	private Calendar countryLastUpdate;
	
	@OneToMany (mappedBy="country")
	private List<City> listCity;
}

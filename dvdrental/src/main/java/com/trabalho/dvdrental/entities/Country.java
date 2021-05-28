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

	public Integer getCountryID() {
		return countryID;
	}

	public void setCountryID(Integer countryID) {
		this.countryID = countryID;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Calendar getCountryLastUpdate() {
		return countryLastUpdate;
	}

	public void setCountryLastUpdate(Calendar countryLastUpdate) {
		this.countryLastUpdate = countryLastUpdate;
	}

	public List<City> getListCity() {
		return listCity;
	}

	public void setListCity(List<City> listCity) {
		this.listCity = listCity;
	}
	
	
}

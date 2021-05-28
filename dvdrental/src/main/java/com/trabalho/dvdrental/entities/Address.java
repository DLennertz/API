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

	public Integer getAddressID() {
		return addressID;
	}

	public void setAddressID(Integer addressID) {
		this.addressID = addressID;
	}

	public String getAddressAddress() {
		return addressAddress;
	}

	public void setAddressAddress(String addressAddress) {
		this.addressAddress = addressAddress;
	}

	public String getAddressAddress2() {
		return addressAddress2;
	}

	public void setAddressAddress2(String addressAddress2) {
		this.addressAddress2 = addressAddress2;
	}

	public String getAddressDistrict() {
		return addressDistrict;
	}

	public void setAddressDistrict(String addressDistrict) {
		this.addressDistrict = addressDistrict;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getAddressPostalCode() {
		return addressPostalCode;
	}

	public void setAddressPostalCode(String addressPostalCode) {
		this.addressPostalCode = addressPostalCode;
	}

	public String getAddressPhone() {
		return addressPhone;
	}

	public void setAddressPhone(String addressPhone) {
		this.addressPhone = addressPhone;
	}

	public Calendar getAddressLastUpdate() {
		return addressLastUpdate;
	}

	public void setAddressLastUpdate(Calendar addressLastUpdate) {
		this.addressLastUpdate = addressLastUpdate;
	}

	public List<Staff> getListStaff() {
		return listStaff;
	}

	public void setListStaff(List<Staff> listStaff) {
		this.listStaff = listStaff;
	}

	public List<Store> getListStore() {
		return listStore;
	}

	public void setListStore(List<Store> listStore) {
		this.listStore = listStore;
	}

	public List<Customer> getListCostumer() {
		return listCostumer;
	}

	public void setListCostumer(List<Customer> listCostumer) {
		this.listCostumer = listCostumer;
	}
	
	
}

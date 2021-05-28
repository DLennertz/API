package com.trabalho.dvdrental.entities;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="film")
public class Film {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="film_id")
	private Integer filmID;
	
	@Column (name="title")
	private String filmTitle;
	
	@Column (name="description")
	private String filmDescription;
	
	@Column (name="release_year")
	private Calendar filmReleaseYear;
	
	@ManyToOne
	@JoinColumn (name="language_id", referencedColumnName="language_id")
	private Language language;
	
	@Column (name="rental_duration")
	private Integer filmRentalDuration;
	
	@Column (name="rental_rate")
	private float filmRentalRate;
	
	@Column (name="length")
	private Integer filmLength;
	
	@Column (name="replacement_cost")
	private float filmReplacementCost;
	
	@Column (name="rating")
	private String filmRating;
	
	@Column (name="last_update")
	private Calendar filmLastUpdate;
	
	@Column (name="special_features")
	private String filmSpecialFeatures;
	
	@Column (name="fulltext")
	private String filmFulltext;
	
	@OneToMany(mappedBy="film")
	private List<Inventory> listInventory;

	public Integer getFilmID() {
		return filmID;
	}

	public void setFilmID(Integer filmID) {
		this.filmID = filmID;
	}

	public String getFilmTitle() {
		return filmTitle;
	}

	public void setFilmTitle(String filmTitle) {
		this.filmTitle = filmTitle;
	}

	public String getFilmDescription() {
		return filmDescription;
	}

	public void setFilmDescription(String filmDescription) {
		this.filmDescription = filmDescription;
	}

	public Calendar getFilmReleaseYear() {
		return filmReleaseYear;
	}

	public void setFilmReleaseYear(Calendar filmReleaseYear) {
		this.filmReleaseYear = filmReleaseYear;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Integer getFilmRentalDuration() {
		return filmRentalDuration;
	}

	public void setFilmRentalDuration(Integer filmRentalDuration) {
		this.filmRentalDuration = filmRentalDuration;
	}

	public float getFilmRentalRate() {
		return filmRentalRate;
	}

	public void setFilmRentalRate(float filmRentalRate) {
		this.filmRentalRate = filmRentalRate;
	}

	public Integer getFilmLength() {
		return filmLength;
	}

	public void setFilmLength(Integer filmLength) {
		this.filmLength = filmLength;
	}

	public float getFilmReplacementCost() {
		return filmReplacementCost;
	}

	public void setFilmReplacementCost(float filmReplacementCost) {
		this.filmReplacementCost = filmReplacementCost;
	}

	public String getFilmRating() {
		return filmRating;
	}

	public void setFilmRating(String filmRating) {
		this.filmRating = filmRating;
	}

	public Calendar getFilmLastUpdate() {
		return filmLastUpdate;
	}

	public void setFilmLastUpdate(Calendar filmLastUpdate) {
		this.filmLastUpdate = filmLastUpdate;
	}

	public String getFilmSpecialFeatures() {
		return filmSpecialFeatures;
	}

	public void setFilmSpecialFeatures(String filmSpecialFeatures) {
		this.filmSpecialFeatures = filmSpecialFeatures;
	}

	public String getFilmFulltext() {
		return filmFulltext;
	}

	public void setFilmFulltext(String filmFulltext) {
		this.filmFulltext = filmFulltext;
	}

	public List<Inventory> getListInventory() {
		return listInventory;
	}

	public void setListInventory(List<Inventory> listInventory) {
		this.listInventory = listInventory;
	}
	
//	@ManyToMany
//	@JoinTable(
//	  name = "film_actor",
//	  joinColumns = @JoinColumn(name = "film_id", referencedColumnName = "film_id"),
//	  inverseJoinColumns = @JoinColumn(name = "actor_id", referencedColumnName = "actor_id")
//	)
//	private List<Actor> listActor;
//	
//	@ManyToMany
//	@JoinTable(
//	  name = "film_category",
//	  joinColumns = @JoinColumn(name = "film_id", referencedColumnName = "film_id"),
//	  inverseJoinColumns = @JoinColumn(name = "category_id", referencedColumnName = "category_id")
//	)
//	private List<Category> listCategory;
	
	
}

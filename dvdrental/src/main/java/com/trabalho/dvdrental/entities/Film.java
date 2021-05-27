package com.trabalho.dvdrental.entities;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	
	@ManyToMany
	@JoinTable(
	  name = "film_actor",
	  joinColumns = @JoinColumn(name = "film_id", referencedColumnName = "film_id"),
	  inverseJoinColumns = @JoinColumn(name = "actor_id", referencedColumnName = "actor_id")
	)
	private List<Actor> listActor;
	
	@ManyToMany
	@JoinTable(
	  name = "film_category",
	  joinColumns = @JoinColumn(name = "film_id", referencedColumnName = "film_id"),
	  inverseJoinColumns = @JoinColumn(name = "category_id", referencedColumnName = "category_id")
	)
	private List<Category> listCategory;
	
	@OneToMany(mappedBy="film")
	private List<Inventory> listInventory;
	
}

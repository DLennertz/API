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
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="category_id")
	private Integer categoryID;
	
	@Column (name="name")
	private String categoryName;
	
	@Column (name="last_update")
	private Calendar caegoryLastUpdate;
	
	@ManyToMany
	@JoinTable(
	  name = "film_category",
	  joinColumns = @JoinColumn(name = "category_id", referencedColumnName = "category_id"),
	  inverseJoinColumns = @JoinColumn(name = "film_id", referencedColumnName = "film_id")
	)
	private List<Film> listFilm;

}

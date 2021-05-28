package com.trabalho.dvdrental.entities;

import java.util.Calendar;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="actor")
public class Actor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="actor_id")
	private Integer actorID;
	
	@Column (name="first_name")
	private String actorFirstName;
	
	@Column (name="last_name")
	private String actorLastName;
	
	@Column (name="last_update")
	private Calendar actorLastUpdate;

	public Integer getActorID() {
		return actorID;
	}

	public void setActorID(Integer actorID) {
		this.actorID = actorID;
	}

	public String getActorFirstName() {
		return actorFirstName;
	}

	public void setActorFirstName(String actorFirstName) {
		this.actorFirstName = actorFirstName;
	}

	public String getActorLastName() {
		return actorLastName;
	}

	public void setActorLastName(String actorLastName) {
		this.actorLastName = actorLastName;
	}

	public Calendar getActorLastUpdate() {
		return actorLastUpdate;
	}

	public void setActorLastUpdate(Calendar actorLastUpdate) {
		this.actorLastUpdate = actorLastUpdate;
	}
	
//	@ManyToMany
//	@JoinTable(
//	  name = "film_actor",
//	  joinColumns = @JoinColumn(name = "actor_id", referencedColumnName = "actor_id"),
//	  inverseJoinColumns = @JoinColumn(name = "film_id", referencedColumnName = "film_id")
//	)
//	private List<Film> listFilm;
	
	

}

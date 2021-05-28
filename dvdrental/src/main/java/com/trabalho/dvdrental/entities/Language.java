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
@Table (name="language")
public class Language {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="language_id")
	private Integer languageID;
	
	@Column (name="name")
	private String languageName;
	
	@Column (name="last_update")
	private Calendar languageLastUpdate;
	
	@OneToMany (mappedBy="language")
	private List<Film> listFilm;

	public Integer getLanguageID() {
		return languageID;
	}

	public void setLanguageID(Integer languageID) {
		this.languageID = languageID;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public Calendar getLanguageLastUpdate() {
		return languageLastUpdate;
	}

	public void setLanguageLastUpdate(Calendar languageLastUpdate) {
		this.languageLastUpdate = languageLastUpdate;
	}

	public List<Film> getListFilm() {
		return listFilm;
	}

	public void setListFilm(List<Film> listFilm) {
		this.listFilm = listFilm;
	}
	
	
}

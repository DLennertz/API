package com.trabalho.dvdrental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trabalho.dvdrental.entities.Language;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Integer>{

}

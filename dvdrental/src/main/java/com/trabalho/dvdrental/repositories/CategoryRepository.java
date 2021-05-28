package com.trabalho.dvdrental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trabalho.dvdrental.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}

package com.trabalho.dvdrental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trabalho.dvdrental.entities.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Integer>{

}

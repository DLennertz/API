package com.trabalho.dvdrental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trabalho.dvdrental.entities.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer>{

}

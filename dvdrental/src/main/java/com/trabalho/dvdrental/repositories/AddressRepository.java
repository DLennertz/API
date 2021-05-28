package com.trabalho.dvdrental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trabalho.dvdrental.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{

}

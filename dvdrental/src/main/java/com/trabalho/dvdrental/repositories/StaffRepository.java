package com.trabalho.dvdrental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trabalho.dvdrental.entities.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer>{

}

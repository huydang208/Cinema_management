package com.example.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cinema.entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer>{

}

package com.example.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cinema.entity.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin, Integer>{
}

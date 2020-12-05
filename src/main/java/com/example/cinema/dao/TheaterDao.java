package com.example.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cinema.entity.Theater;

@Repository
public interface TheaterDao extends JpaRepository<Theater, Integer>{

}

package com.example.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cinema.entity.Auditorium;

@Repository
public interface AuditoriumDao extends JpaRepository<Auditorium, Integer>{
}

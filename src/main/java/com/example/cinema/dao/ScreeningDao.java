package com.example.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cinema.entity.Screening;

@Repository
public interface ScreeningDao extends JpaRepository<Screening, Integer> {

}

package com.example.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cinema.entity.Movie;

@Repository
public interface MovieDao extends JpaRepository<Movie, Integer> {

}

package com.example.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cinema.entity.Genre;

@Repository
public interface GenreDao extends JpaRepository<Genre, Integer> {

}

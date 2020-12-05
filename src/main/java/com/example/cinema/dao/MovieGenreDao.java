package com.example.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cinema.entity.MovieGenre;

import compositeid.MovieGenreId;

@Repository
public interface MovieGenreDao extends JpaRepository<MovieGenre, MovieGenreId> {

}

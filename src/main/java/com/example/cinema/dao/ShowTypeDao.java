package com.example.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cinema.entity.ShowType;

@Repository
public interface ShowTypeDao extends JpaRepository<ShowType, Integer> {

}

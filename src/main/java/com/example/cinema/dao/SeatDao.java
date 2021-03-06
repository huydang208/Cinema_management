package com.example.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cinema.entity.Seat;

@Repository
public interface SeatDao extends JpaRepository<Seat, Integer> {

}

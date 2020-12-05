package com.example.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cinema.entity.SeatDetail;

import compositeid.SeatDetailId;

@Repository
public interface SeatDetailDao extends JpaRepository<SeatDetail, SeatDetailId> {

}

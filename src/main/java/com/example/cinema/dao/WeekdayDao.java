package com.example.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cinema.entity.Weekday;

@Repository
public interface WeekdayDao extends JpaRepository<Weekday, Integer>{

}

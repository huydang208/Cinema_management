package com.example.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cinema.entity.Image;

@Repository
public interface ImageDao extends JpaRepository<Image, Integer> {

}

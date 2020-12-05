package com.example.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cinema.entity.Participant;

@Repository
public interface ParticipantDao extends JpaRepository<Participant, Integer> {

}

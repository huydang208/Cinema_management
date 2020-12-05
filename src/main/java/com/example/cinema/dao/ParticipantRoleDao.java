package com.example.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cinema.entity.ParticipantRole;

import compositeid.ParticipantRoleId;

@Repository
public interface ParticipantRoleDao extends JpaRepository<ParticipantRole, ParticipantRoleId>{

}

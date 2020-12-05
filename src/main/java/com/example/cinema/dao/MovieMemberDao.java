package com.example.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cinema.entity.MovieMember;

import compositeid.MovieMemberId;

@Repository
public interface MovieMemberDao extends JpaRepository<MovieMember, MovieMemberId>{

}

package com.example.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cinema.entity.AdminDetail;

import compositeid.AdminDetailId;

@Repository
public interface AdminDetailDao extends JpaRepository<AdminDetail, AdminDetailId> {

}

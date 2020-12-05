package com.example.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cinema.entity.Role;

@Repository
public interface RoleDao extends JpaRepository<Role, Integer>{

}

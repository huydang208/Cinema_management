package com.example.cinema.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Admin")
public class Admin extends BaseEntity {	
	
	@Column(name = "user_name", columnDefinition = ("VARCHAR(50) UNIQUE NOT NULL"))
	private String userName;
	
	@Column(name = "password", columnDefinition = ("VARCHAR(50) NOT NULL"))
	private String password;
	
	@Column(name = "level", columnDefinition = ("BOOLEAN NOT NULL"))
	private String level;
	
	@OneToMany(mappedBy = "admin")
	private List<AdminDetail> adminDetail;
	
	@OneToMany(mappedBy = "admin")
	private List<Bill> bill;
}

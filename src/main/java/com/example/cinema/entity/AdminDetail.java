package com.example.cinema.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import compositeid.AdminDetailId;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "admin_detail")
@IdClass(AdminDetailId.class)
public class AdminDetail{
	
	@Id
	@ManyToOne
	@JoinColumn(name = "admin_id")
	private Admin admin;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "facility_id")
	private Facility facility;
	
}


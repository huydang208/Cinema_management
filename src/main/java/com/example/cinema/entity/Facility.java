package com.example.cinema.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Facility")
public class Facility extends BaseEntity {
	
	@Column(name = "address", columnDefinition = ("VARCHAR(50) NOT NULL"))
	private String address;
	
	@OneToMany(mappedBy = "facility")
	private List<Auditorium> auditorium;
	
	@OneToMany(mappedBy = "facility")
	private List<AdminDetail> adminDetail;
	
	@ManyToOne
	@JoinColumn(name = "theater_id")
	private Theater theater;
	
}

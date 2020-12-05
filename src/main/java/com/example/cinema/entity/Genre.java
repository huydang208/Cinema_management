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
@Table(name = "genre")
public class Genre extends BaseEntity{
	 
	@Column(name = "name", columnDefinition = "VARCHAR(50) NOT NULL")
	private String name;
	
	@OneToMany(mappedBy = "genre")
	private List<MovieGenre> movieGenre;
}

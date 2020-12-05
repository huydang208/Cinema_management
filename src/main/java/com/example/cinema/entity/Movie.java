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
@Table(name = "movie")
public class Movie extends BaseEntity{
	
	@Column(name = "name", columnDefinition = "VARCHAR(50) NOT NULL")
	private String name;
	
	@Column(name = "date", columnDefinition = "VARCHAR(50) NOT NULL")
	private String date;
	
	@Column(name = "code", columnDefinition = "VARCHAR(50) NOT NULL")
	private String code;
	
	@OneToMany(mappedBy = "movie")
	private List<Screening> screening;
	
	@OneToMany(mappedBy = "movie")
	private List<Image> image;
	
	@OneToMany(mappedBy = "movie")
	private List<MovieGenre> movieGenre;
	
	@OneToMany(mappedBy = "movie")
	private List<MovieMember> movieMember;
}

package com.example.cinema.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "image")
public class Image extends BaseEntity{
	
	@Column(name = "image", columnDefinition = "VARCHAR(200) NOT NULL")
	private String image;
	
	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;
}

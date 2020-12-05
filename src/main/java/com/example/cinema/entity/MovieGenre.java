package com.example.cinema.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import compositeid.MovieGenreId;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "movie_genre")
@IdClass(MovieGenreId.class)
public class MovieGenre {
	
	@Id
	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "genre_id")
	private Genre genre;
}

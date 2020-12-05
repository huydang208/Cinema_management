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
@Table(name = "screening")
public class Screening extends BaseEntity{
	
	@Column(name = "release_date", columnDefinition = "DATE NOT NULL")
	private String releaseDate;
	
	@Column(name = "start_at", columnDefinition = "TIME NOT NULL")
	private String startAt;
	
	@Column(name = "end_at", columnDefinition = "TIME NOT NULL")
	private String endAt;
	
	@OneToMany(mappedBy = "screening")
	private List<Reservation> reservation;
	
	@ManyToOne
	@JoinColumn(name = "show_type_id")
	private ShowType showType;
	
	@ManyToOne
	@JoinColumn(name = "weekday_id")
	private Weekday weekday;
	
	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;
	
}

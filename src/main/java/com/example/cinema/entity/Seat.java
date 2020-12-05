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
@Table(name = "Seat")
public class Seat extends BaseEntity{
	
	@Column(name = "number", columnDefinition = ("INT UNIQUE NOT NULL"))
	private int number;
	
	@Column(name = "row", columnDefinition = ("VARCHAR(10) UNIQUE NOT NULL"))
	private String row;
	
	@Column(name = "type", columnDefinition = ("BOOLEAN UNIQUE NOT NULL"))
	private boolean type;
	
//	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@JoinTable(name = "Seat_detail",
//			joinColumns = { @JoinColumn(name = "seat_id") },
//			inverseJoinColumns = { @JoinColumn(name = "auditorium_id") })
//	private Set<Auditorium> auditorium = new HashSet<>();
	
	@OneToMany(mappedBy = "seat")
	private List<SeatDetail> seatDetails;
}

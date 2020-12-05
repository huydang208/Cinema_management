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
@Table(name = "Auditorium")
public class Auditorium extends BaseEntity{
	
	@Column(name = "auditorium_number", columnDefinition = ("INT(11) NOT NULL"))
	private int auditoriumNumber;
	
	@ManyToOne
	@JoinColumn(name = "type_id")
	private AuditoriumType auditoriumType;
	
	@ManyToOne
	@JoinColumn(name = "facility_id")
	private Facility facility;
	
//	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,
//		mappedBy = "auditorium")
//	private Set<Seat> seat = new HashSet<>();
	
	@OneToMany(mappedBy = "auditorium")
	private List<SeatDetail> seatDetails;
}

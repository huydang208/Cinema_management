package com.example.cinema.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import compositeid.SeatDetailId;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Seat_detail")
@IdClass(SeatDetailId.class)
public class SeatDetail{

	@Id
	@ManyToOne
	@JoinColumn(name = "seat_id")
	private Seat seat;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "auditorium_id")
	private Auditorium auditorium;
	
	@OneToMany(mappedBy = "seatDetail")
	private List<Reservation> reservation;
	
}

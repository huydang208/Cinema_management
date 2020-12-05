package com.example.cinema.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Reservation")
public class Reservation extends BaseEntity{
	
	@Column(name = "order_date", columnDefinition = ("DATE NOT NULL"))
	private String orderDate;
	
	@Column(name = "code", columnDefinition = ("VARCHAR(50) UNIQUE NOT NULL"))
	private String code;
	
	@ManyToOne
	@JoinColumn(name = "screening_id")
	private Screening screening;
	
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "seat_id"),
		@JoinColumn(name = "auditorium_id")
	})
	private SeatDetail seatDetail;
	
	@OneToOne(mappedBy = "reservation")
	private Ticket ticket;

}

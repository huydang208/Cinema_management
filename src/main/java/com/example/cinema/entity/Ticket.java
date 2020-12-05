package com.example.cinema.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Ticket")
public class Ticket extends BaseEntity {
	
	@ManyToOne
	@JoinColumn(name = "bill_id")
	private Bill bill;
	
	@OneToOne
	@JoinColumn(name = "reservation_id", referencedColumnName = "id")
	private Reservation reservation;
	
}

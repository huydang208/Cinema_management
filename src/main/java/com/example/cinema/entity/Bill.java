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
@Table(name = "Bill")
public class Bill extends BaseEntity{
	
	@Column(name  = "price", columnDefinition = ("FLOAT NOT NULL"))
	private float price;
	
	@Column(name = "date", columnDefinition = ("DATE NOT NULL"))
	private String date;
	
	@Column(name = "code", columnDefinition = ("VARCHAR(50) UNIQUE NOT NULL"))
	private String code;
	
	@ManyToOne
	@JoinColumn(name = "bill_id")
	private Admin admin;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	@OneToMany(mappedBy = "bill")
	private List<Ticket> ticket;
}

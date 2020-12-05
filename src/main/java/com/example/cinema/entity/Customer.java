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
@Table(name = "Customer")
public class Customer extends BaseEntity {
	
	@Column(name = "first_name", columnDefinition = ("VARCHAR(50) NOT NULL"))
	private String firstName;
	
	@Column(name = "last_name", columnDefinition = ("VARCHAR(50) NOT NULL"))
	private String lastName;
	
	@Column(name = "email", columnDefinition = ("VARCHAR(50) UNIQUE NOT NULL"))
	private String email;
	
	@Column(name = "password", columnDefinition = ("VARCHAR(50) NOT NULL"))
	private String password;
	
	@Column(name = "phone", columnDefinition = ("VARCHAR(50) UNIQUE NOT NULL"))
	private String phone;
	
	@Column(name = "address", columnDefinition = ("VARCHAR(50)"))
	private String address;
	
	@Column(name = "code", columnDefinition = ("VARCHAR(50) UNIQUE NOT NULL"))
	private String code;
	
	@OneToMany(mappedBy = "customer")
	private List<Bill> bill;
}

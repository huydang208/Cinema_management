package com.example.cinema.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "participant")
public class Participant extends BaseEntity{
	
	@Column(name = "first_name", columnDefinition = "VARCHAR(50) NOT NULL")
	private String firstName;
	
	@Column(name = "last_name", columnDefinition = "VARCHAR(50) NOT NULL")
	private String lastName;
	
	@Column(name = "dob", columnDefinition = "DATE NOT NULL")
	private String dob;
	
	@Column(name = "birthplace", columnDefinition = "TEXT NOT NULL")
	private String birthplace;
	
	@OneToMany(mappedBy = "participant")
	private List<MovieMember> movieMember;
	
	@OneToMany(mappedBy = "participant")
	private List<ParticipantRole> participantRole;
}

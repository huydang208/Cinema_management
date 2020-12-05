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
@Table(name = "role")
public class Role extends BaseEntity{
	
	@Column(name = "role", columnDefinition = "VARCHAR(50) NOT NULL")
	private String role;
	
	@OneToMany(mappedBy = "role")
	private List<ParticipantRole> participantRole;
}

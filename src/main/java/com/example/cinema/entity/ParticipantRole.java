package com.example.cinema.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import compositeid.ParticipantRoleId;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "participant_role")
@IdClass(ParticipantRoleId.class)
public class ParticipantRole {
	
	@Id
	@ManyToOne
	@JoinColumn(name = "role_id")
	private Role role;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "participant_id")
	private Participant participant;
}

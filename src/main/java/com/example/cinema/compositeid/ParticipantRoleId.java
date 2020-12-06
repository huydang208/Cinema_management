package com.example.cinema.compositeid;

import java.io.Serializable;

import com.example.cinema.entity.Participant;
import com.example.cinema.entity.Role;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class ParticipantRoleId implements Serializable {
	private static final long serialVersionUID = 1L;
	private Participant participant;
	private Role role;
}

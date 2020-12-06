package com.example.cinema.compositeid;

import java.io.Serializable;

import com.example.cinema.entity.Movie;
import com.example.cinema.entity.Participant;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class MovieMemberId implements Serializable{
	private static final long serialVersionUID = 1L;
	private Movie movie;
	private Participant participant;
}

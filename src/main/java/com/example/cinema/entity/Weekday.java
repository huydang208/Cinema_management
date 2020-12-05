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
@Table(name = "Weekday")
public class Weekday extends BaseEntity {
	
	@Column(name = "date", columnDefinition = ("DATE NOT NULL"))
	private String date;
	
	@OneToMany(mappedBy = "weekday")
	private List<Screening> screening;
}

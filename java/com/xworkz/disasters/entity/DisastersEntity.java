package com.xworkz.disasters.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "disasters")
public class DisastersEntity {
	@Id
	@Column(name = "D_ID")
	@GenericGenerator(name = "any", strategy = "increment")
	@GeneratedValue(generator = "any")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "MOST_AFFECTED_AREA")
	private String mostAffectedAreas;
	@Column(name = "NO_OF_PEOPLE_KILLED_EVERY_YEAR")
	private int noOfPeoprlKilledEveyYear;
	@Column(name = "DANGOROUS_LEVEL")
	private int dangereousLevel;
	@Column(name = "MONEY_DONATED")
	private double moneyDoneted;
}

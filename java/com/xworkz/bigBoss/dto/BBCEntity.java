package com.xworkz.bigBoss.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "bbc")
public class BBCEntity {
	@Column(name = "name")
	private String name;
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "id")
	private int id;
	@Column(name = "season_no")
	private int seasonNo;
	@Column(name = "contestant_type")
	private String contestantType;
	@Column(name = "gender")
	private String gender;
	@Column(name = "days_in")
	private int daysIn;
	@Column(name = "no_of_task")
	private int noOfTask;

}

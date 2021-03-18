package com.xworkz.waterfall.entity;

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
@Table(name = "waterfall")
public class WaterfallEntity {
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "wid")
	private int wid;
	@Column(name = "name")
	private String name;
	@Column(name = "location")
	private String location;
	@Column(name = "height")
	private double height;
	@Column(name = "depth")
	private double depth;
	@Column(name = "electriciyGenerated")
	private boolean electriciyGenerated;
	@Column(name = "sourceRiver")
	private String sourceRiver;
	@Column(name = "entryFees")
	private int entryFees;
	@Column(name = "destination")
	private String destination;
	@Column(name = "rating")
	private int rating;
	@Column(name = "noOfDeath")
	private int noOfDeath;
	@Column(name = "noOfVisitors")
	private int noOfVisitors;
}

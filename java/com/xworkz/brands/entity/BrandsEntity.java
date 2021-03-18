package com.xworkz.brands.entity;

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
@ToString
@NoArgsConstructor
@Entity
@Table(name = "brands")
public class BrandsEntity {
	@Id
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator =  "auto")
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "famous_for")
	private String famousFor;
	@Column(name = "origin_country")
	private String originCountry;
	@Column(name = "good_quality")
	private boolean goodQuality;
	@Column(name = "owner_name")
	private String ownerName;
}

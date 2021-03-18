package com.xworkz.waterfall.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name = "state")
public class StateEntity {
	@Id
	@Column(name = "S_ID")
	@GenericGenerator(name = "any", strategy = "increment")
	@GeneratedValue(generator = "any")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "NO_OF_DISTRICT")
	private String NoOfDistrict;
	@Column(name = "LANGUAGE")
	private String language;
	public StateEntity(int id, String name, String noOfDistrict, String language) {
		this.id = id;
		this.name = name;
		NoOfDistrict = noOfDistrict;
		this.language = language;
	}
	
	
}

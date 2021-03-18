package com.xworkz.richPerson.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "rich_person")
public class RichEntity {
	@Id
	@Column(name = "id")
	private int ID;
	@Column(name = "NAME")
	private String name;
	@Column(name = "COUNTRY")
	private String country;
	@Column(name = "NET_WORTH_IN_BILLION")
	private int netWorthInBillon;
	@Column(name = "BUISNESS")
	private String buisness;
	@Column(name = "RANK_VALUE")
	private int rank;
	@Column(name = "MARRIED")
	private boolean married;
}

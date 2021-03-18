package com.xworkz.cartoonCharacter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "cartoon")
public class CartoonEntity {
	 public CartoonEntity() {
		
	}
	@Id
	@Column(name = "C_ID")
	private int id;
	@Column(name = "SHOW_NAME")
	private String showName;
	@Column(name = "CHANNEL_NAME")
	private String channelName;
	@Column(name = "LANGUAGE")
	private String language;
	@Column(name = "NAME")
	private String name;
}

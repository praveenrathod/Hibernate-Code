package com.xworkz.coupon.entity;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "coupon_management")
public class CouponEntity {
	@Id
	@Column(name = "C_ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "CODE")
	private int code;
	@Column(name = "VALIDITY_IN_MONTHS")
	private int validityInMonths;
	@Column(name = "DISCOUNT")
	private String discount;
}
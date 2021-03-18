package com.xworkz.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "product")
public class ProductEntity {
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "P_ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "TYPE")
	private ProductType type;
	@Column(name = "PRICE")
	private double price;
	@Column(name = "QUANTITY")
	private int quantity;
	@Column(name = "QUALITY")
	private boolean quality;
	@Column(name = "MANUFACTURER")
	private String manufacturer;
	@Column(name = "BRAND")
	private String brand;

	public enum ProductType {
		HOME_APPLIANCES, ELECTRONIC, COMPUTERS, FASHION
	}
}

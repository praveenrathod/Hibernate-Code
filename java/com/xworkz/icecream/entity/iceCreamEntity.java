package com.xworkz.icecream.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ice_cream")
@NamedQueries({
		@NamedQuery(name = "deleteByName", query = "delete from iceCreamEntity ice where ice.name=:nm") ,
		@NamedQuery(name = "updatePriceByName", query = "update iceCreamEntity ice set ice.price=:pr where ice.name=:nm"),
		@NamedQuery(name = "getAll", query = "select ice from iceCreamEntity ice")})
public class iceCreamEntity {
	@Id
	private int id;
	private String name;
	private Flavour flavour;
	private double price;
	private Color color;
	private String brand;

	public enum Flavour {
		CHOCOLATE, MIXED, VANILLA, BUTTERSCOTCH, RASBERRY, COFFEE, KULFI
	}

	public enum Color {
		BLACK, ORANGE, WHITE, BROWN, GREEN, BLUE, MIX
	}
}

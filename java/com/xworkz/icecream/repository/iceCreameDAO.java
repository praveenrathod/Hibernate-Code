package com.xworkz.icecream.repository;

import java.util.List;

import com.xworkz.icecream.entity.iceCreamEntity;

public interface iceCreameDAO {
	
	public void persist(iceCreamEntity entity);

	public void deleteByName(String name);

	public void updatePriceByName(String name, double price);

	public List<iceCreamEntity> getAll();

	public iceCreamEntity findBynameAndPrice(String name, double price);

	public iceCreamEntity getByMaxPrice();

	public iceCreamEntity getByMinPrice();

	public boolean getBySumPrice();

	public double getPriceByName(String name);

	public List<Object[]> getNameAndFlavourByPrice(double price);

}

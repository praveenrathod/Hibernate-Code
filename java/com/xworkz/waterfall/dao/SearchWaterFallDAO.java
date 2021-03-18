package com.xworkz.waterfall.dao;

public interface SearchWaterFallDAO extends WaterFallDAO {

	
	public String findLocationByName(String name);
	
	public int findNoOfDeathsByLocationAndName(String location, String name);
	
	public Object[] findNoOfDeathsAndDestinationByLocation(String location , String name);
}

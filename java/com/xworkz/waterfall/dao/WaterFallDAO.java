package com.xworkz.waterfall.dao;

import com.xworkz.waterfall.entity.WaterfallEntity;

public interface WaterFallDAO {

	public void create(WaterfallEntity entity);
	
	public WaterfallEntity getById(int id);
	
	public void updateHeightAndDepthById(int id , double height, double depth);
	
	public void deleteById(int id);
}

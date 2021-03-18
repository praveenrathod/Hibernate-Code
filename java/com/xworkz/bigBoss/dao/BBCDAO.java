package com.xworkz.bigBoss.dao;

import com.xworkz.bigBoss.dto.BBCEntity;

public interface BBCDAO {

	public void create(BBCEntity entity);
	
	public BBCEntity getById(int id);
	
	public BBCEntity updateByNoOfTaskAndDaysInById(int id, int noOfTask,int daysIn);
	
	public void deleteById(int id);
}

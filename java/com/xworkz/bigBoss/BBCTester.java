package com.xworkz.bigBoss;

import com.xworkz.bigBoss.dao.BBCDAO;
import com.xworkz.bigBoss.dao.BBCDAOImpl;
import com.xworkz.bigBoss.dto.BBCEntity;

public class BBCTester {

	public static void main(String[] args) {
		BBCEntity entity = new BBCEntity();
		entity.setId(1);
		entity.setName("Drone");
		entity.setGender("male");
		entity.setNoOfTask(15);
		entity.setSeasonNo(10);
		entity.setContestantType("comedian");
		entity.setDaysIn(56);
		BBCDAO bbc = new BBCDAOImpl();
		bbc.create(entity);
		
		BBCEntity entity2 = new BBCEntity();
		entity2.setId(1);
		entity2.setName("Drone");
		entity2.setGender("male");
		entity2.setNoOfTask(15);
		entity2.setSeasonNo(10);
		entity2.setContestantType("comedian");
		entity2.setDaysIn(56);
		
		BBCDAO bbc2 = new BBCDAOImpl();
		bbc2.create(entity2);
		bbc2.create(entity2);
		bbc2.create(entity2);
		bbc2.create(entity2);
		
		BBCEntity id = bbc2.getById(2);
		System.out.println(id);

		BBCEntity updateByNoOfTaskAndDaysInById = bbc2.updateByNoOfTaskAndDaysInById(4, 3, 2);
		System.out.println(updateByNoOfTaskAndDaysInById);
		
		bbc2.deleteById(6);
		
	}

}

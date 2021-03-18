package com.xworkz.disasters;

import java.util.ArrayList;

import com.xworkz.disasters.dao.DisastersDAO;
import com.xworkz.disasters.dao.DisastersDAOImpl;
import com.xworkz.disasters.entity.DisastersEntity;

public class DisasterTester {

	public static void main(String[] args) {
		DisastersEntity entity = new DisastersEntity();
		entity.setName("Earthquakes");
		entity.setDangereousLevel(7);
		entity.setMoneyDoneted(34760000);
		entity.setMostAffectedAreas("china");
		entity.setNoOfPeoprlKilledEveyYear(9400);

		DisastersEntity entity2 = new DisastersEntity();
		entity2.setName("Tsunam");
		entity2.setDangereousLevel(10);
		entity2.setMoneyDoneted(347690);
		entity2.setMostAffectedAreas("tamilNadu");
		entity2.setNoOfPeoprlKilledEveyYear(7400);

		DisastersEntity entity3 = new DisastersEntity();
		entity3.setName("flood");
		entity3.setDangereousLevel(10);
		entity3.setMoneyDoneted(347690);
		entity3.setMostAffectedAreas("kerala");
		entity3.setNoOfPeoprlKilledEveyYear(7400);

		DisastersDAO dao = new DisastersDAOImpl();
		// dao.CreateDisaster(entity);
		//dao.CreateDisaster(entity2);
//	dao.CreateDisaster(entity3);

		DisastersEntity byId = dao.getById(2);
		System.out.println(byId);

		dao.updateDangereousLevelAndNameById(2, "flood", 7);

		 dao.deleteById(7);
		dao.deleteById(8);
		dao.deleteById(9);
		dao.deleteById(10);
		dao.deleteById(11);
		dao.deleteById(12);
		dao.deleteById(13);
		dao.deleteById(14);
		dao.deleteById(15);
		dao.deleteById(16);
		dao.deleteById(17);
		
		DisastersEntity entity4=new DisastersEntity(1, "fire", "Aamazon", 7894, 9, 2039990);
		DisastersEntity entity5=new DisastersEntity(2, "landSliding", "himalayas", 12000, 6, 304757);
		DisastersEntity entity6=new DisastersEntity(3, "tornado", "calcutta", 485, 8, 20387);
		
		ArrayList<DisastersEntity> list=new ArrayList();
		list.add(entity4);
		list.add(entity5);
		list.add(entity6);
		
		dao.create(list);
	}

}

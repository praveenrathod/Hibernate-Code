package com.xworkz.icecream;

import com.xworkz.icecream.entity.iceCreamEntity;
import com.xworkz.icecream.entity.iceCreamEntity.Color;
import com.xworkz.icecream.entity.iceCreamEntity.Flavour;
import com.xworkz.icecream.repository.iceCreameDAO;
import com.xworkz.icecream.repository.iceCreameDAOImpl;

public class iceCreamtester {

	public static void main(String[] args) {
		iceCreamEntity creamEntity = new iceCreamEntity(3, "CORNATO", Flavour.CHOCOLATE, 60, Color.BROWN, "AMUL");
		
		iceCreamEntity creamEntity2 = new iceCreamEntity(2, "CHOCOBAR", Flavour.KULFI, 40, Color.BROWN, "BAMUL");
		
		iceCreamEntity creamEntity3= new iceCreamEntity(1, "CUP", Flavour.RASBERRY, 30, Color.GREEN, "BASKIN & ROBBINS");



		iceCreameDAO dao = new iceCreameDAOImpl();
		//dao.persist(creamEntity);
		//dao.persist(creamEntity);
		//dao.persist(creamEntity2);
		
		dao.deleteByName("CUP");
		
		//dao.updatePriceByName("CUP", 90);
		
		//dao.getAll();
	}

}

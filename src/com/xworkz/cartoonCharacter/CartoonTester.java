package com.xworkz.cartoonCharacter;

import java.util.ArrayList;

import com.xworkz.cartoonCharacter.dao.CartoonDAO;
import com.xworkz.cartoonCharacter.dao.CartoonDAOImpl;
import com.xworkz.cartoonCharacter.entity.CartoonEntity;

public class CartoonTester {

	public static void main(String[] args) {
		CartoonEntity cartoonEntity = new CartoonEntity(1, "shinChan", "HUNGAMA", "HINDI", "shinChan");
		CartoonEntity cartoonEntity2 = new CartoonEntity(2, "Doremon", "POGO", "ENG", "DOREMON");
		CartoonEntity cartoonEntity3 = new CartoonEntity(3, "Power Rangers", "Cartoon Network", "HINDI", "Power1");
		CartoonEntity cartoonEntity4 = new CartoonEntity(4, "Mr. Bean", "POGO", "HINDI", "bean");


		CartoonDAO dao = new CartoonDAOImpl();
		ArrayList<CartoonEntity> list = new ArrayList<CartoonEntity>();
		//list.add(cartoonEntity);
//		list.add(cartoonEntity2);
//		list.add(cartoonEntity3);
//		list.add(cartoonEntity4);
//		dao.saveAll(list);
		
		CartoonEntity findByName = dao.findByName("Power1");
		System.out.println(findByName);
		
		CartoonEntity findByLanguage = dao.findByLanguage("POGO", "ENG");
		System.out.println(findByLanguage);
		
	}

}

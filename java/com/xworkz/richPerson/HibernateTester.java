package com.xworkz.richPerson;

import com.xworkz.richPerson.dao.RichPersonDAO;
import com.xworkz.richPerson.dao.RichPersonDAOImpl;
import com.xworkz.richPerson.entity.RichEntity;

public class HibernateTester {

	public static void main(String[] args) {

		RichEntity entity=new RichEntity();
		entity.setID(1);
		entity.setName("Bill Gates");
		entity.setCountry("USA");
		entity.setMarried(true);
		entity.setBuisness("Software");
		entity.setNetWorthInBillon(134);
		entity.setRank(3);
		
		RichPersonDAO dao=new RichPersonDAOImpl();
		dao.create(entity);
		
		
		
	}

}

package com.xworkz.waterfall;

import java.util.ArrayList;

import com.xworkz.waterfall.dao.StateDAO;
import com.xworkz.waterfall.dao.StateDAOImpl;
import com.xworkz.waterfall.entity.StateEntity;

public class StateTester {

	public static void main(String[] args) {
		StateEntity entity = new StateEntity(1, "Maharashtra", "27", "marathi");
		StateEntity entity2 = new StateEntity(2, "karnataka", "31", "kannada");
		StateEntity entity3 = new StateEntity(3, "gujrat", "24", "gujrati");
		StateEntity entity4 = new StateEntity(4, "TamilNadu", "30", "Tamil");
		StateEntity entity5 = new StateEntity(5, "Kerala", "20", "Malyalam");

		ArrayList<StateEntity> entities = new ArrayList<StateEntity>();
		entities.add(entity5);
		entities.add(entity4);
		entities.add(entity3);
		entities.add(entity2);
		entities.add(entity);
		
		StateDAO dao=new StateDAOImpl();
		dao.create(entities);

	}

}

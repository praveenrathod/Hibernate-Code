package com.xworkz.waterfall.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.xworkz.waterfall.util.SFUtil;

public class SearchWaterFallDAOImpl extends WaterFallDAOImpl implements SearchWaterFallDAO {
	SessionFactory factory = SFUtil.getFactory();

	@Override
	public String findLocationByName(String name) {
		try (Session session = factory.openSession()) {
			String hql = "select water.location from WaterfallEntity water where water.name=:nm";
			Query<String> query = session.createQuery(hql);
			query.setParameter("nm", name);
			return query.uniqueResult();

		}

	}

	@Override
	public int findNoOfDeathsByLocationAndName(String location, String name) {
		try (Session session = factory.openSession()) {
			String hql = "select water.noOfDeath  from WaterfallEntity water where water.location=:loc and water.name=:nm";
			Query<Integer> query = session.createQuery(hql);
			query.setParameter("nm", name);
			query.setParameter("loc", location);
			return query.uniqueResult();
		}

	}

	@Override
	public Object[] findNoOfDeathsAndDestinationByLocation(String location, String name) {
		try (Session session = factory.openSession()) {
			String hql = "select water.noOfDeath, water.destination from WaterfallEntity water where water.location=:loc and water.name=:nm";
			Query<Object[]> query = session.createQuery(hql);
			query.setParameter("loc", location);
			query.setParameter("nm", name);
			return query.uniqueResult();

		}

	}

}

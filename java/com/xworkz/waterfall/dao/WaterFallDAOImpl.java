package com.xworkz.waterfall.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.waterfall.entity.WaterfallEntity;
import com.xworkz.waterfall.util.SFUtil;

public class WaterFallDAOImpl implements WaterFallDAO {

	private SessionFactory factory = SFUtil.getFactory();

	@Override
	public void create(WaterfallEntity entity) {
		System.out.println("creating waterfall entity");
		System.out.println("entity" + entity);
		try {
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public WaterfallEntity getById(int id) {
		System.out.println("getting entity by id");
		WaterfallEntity entity = null;
		try {
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			entity = session.get(WaterfallEntity.class, id);
			if (entity != null) {
				System.out.println("getting entity by id");
				transaction.commit();
				session.close();
			} else {
				System.out.println("cant get the id");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return entity;

	}

	@Override
	public void updateHeightAndDepthById(int id, double height, double depth) {
		System.out.println("updating height anf depth by id");
		try {
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			WaterfallEntity entity = session.get(WaterfallEntity.class, id);
			if (entity != null) {
				System.out.println("can update the entity");
				entity.setDepth(depth);
				entity.setHeight(height);
				session.update(entity);
				transaction.commit();
				session.close();
			} else {
				System.out.println("cant update the given entity");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteById(int id) {
		System.out.println("deleting by id");
		try(Session session = factory.openSession()){
			Transaction transaction = session.beginTransaction();
			WaterfallEntity entity = session.get(WaterfallEntity.class, id);
			if (entity != null) {
				System.out.println("deleting the entity");
				session.delete(entity);
				transaction.commit();
				session.close();
			} else {
				System.out.println("id not found");
			}
		}
		

	}
}

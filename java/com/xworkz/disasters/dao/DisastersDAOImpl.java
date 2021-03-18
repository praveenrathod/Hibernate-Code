package com.xworkz.disasters.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.disasters.entity.DisastersEntity;
import com.xworkz.disasters.util.SFUtil;


public class DisastersDAOImpl implements DisastersDAO {
	SessionFactory factoty = SFUtil.getFactory();

	@Override
	public void CreateDisaster(DisastersEntity entity) {
		System.out.println("creating disasters entity");
		try (Session session = factoty.openSession()) {
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			if (entity != null) {
				transaction.commit();
				session.close();
			} else {
				System.out.println("cant add the null values");
			}
		}
	}

	@Override
	public DisastersEntity getById(int id) {
		DisastersEntity entity = null;
		System.out.println("getting entity by id");
		try (Session session = factoty.openSession()) {
			Transaction transaction = session.beginTransaction();
			entity = session.get(DisastersEntity.class, id);
			if (entity != null) {
				System.out.println("getting id");
				transaction.commit();
				session.close();
			}
		}
		return entity;
	}

	@Override
	public DisastersEntity updateDangereousLevelAndNameById(int id, String name, int dangereosLevel) {
		DisastersEntity entity = null;
		try (Session session = factoty.openSession()) {
			Transaction transaction = session.beginTransaction();
			entity = session.get(DisastersEntity.class, id);
			if (entity != null) {
				System.out.println("can update the entity");
				entity.setDangereousLevel(dangereosLevel);
				entity.setName(name);
				session.update(entity);
				transaction.commit();
				session.close();
			} else {
				System.out.println("cant update the entity");
			}
		}
		return entity;
	}

	@Override
	public void deleteById(int id) {
		try (Session session = factoty.openSession()) {
			Transaction transaction = session.beginTransaction();
			DisastersEntity entity = session.get(DisastersEntity.class, id);
			if (entity != null) {
				System.out.println("can delete the given entity");
				session.delete(entity);
				transaction.commit();
				session.close();
			} else {
				System.out.println("cant delete the given id");
			}
		}
	}

	@Override
	public void create(List<DisastersEntity> list) {
		Transaction transaction = null;
		try {
			Session session = factoty.openSession();
			transaction = session.beginTransaction();
			for (DisastersEntity disasterEntity : list) {
				session.save(disasterEntity);
			}
			session.flush();
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();

		}
	}
}

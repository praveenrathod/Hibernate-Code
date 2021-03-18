package com.xworkz.bigBoss.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.bigBoss.dto.BBCEntity;

public class BBCDAOImpl implements BBCDAO {
	public BBCDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create(BBCEntity entity) {
		System.out.println("invoked entity");
		System.out.println("entity" + entity);
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(BBCEntity.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(entity);
		transaction.commit();
		session.close();
		factory.close();
	}

	@Override
	public BBCEntity getById(int id) {
		System.out.println("getting by id");
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(BBCEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		BBCEntity entity = session.get(BBCEntity.class, id);
		transaction.commit();
		session.close();
		factory.close();
		return entity;

	}

	@Override
	public BBCEntity updateByNoOfTaskAndDaysInById(int id, int noOfTask, int daysIn) {
		System.out.println("updating by id");
		Configuration configuration = new Configuration().configure().addAnnotatedClass(BBCEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		BBCEntity entity = session.get(BBCEntity.class, id);
		if (entity != null) {
			System.out.println("entity found can update");
			entity.setDaysIn(daysIn);
			entity.setNoOfTask(noOfTask);
			session.update(entity);
			transaction.commit();
			session.close();
			factory.close();

		} else {
			System.out.println("entity not found cant update");
		}

		return entity;
	}

	@Override
	public void deleteById(int id) {
		System.out.println("deleteing entry by id");
		Configuration configuration = new Configuration().configure().addAnnotatedClass(BBCEntity.class);
		SessionFactory session = configuration.buildSessionFactory();
		Session openSession = session.openSession();
		Transaction transaction = openSession.beginTransaction();
		BBCEntity entity = openSession.get(BBCEntity.class, id);
		if (entity != null) {
			System.out.println("found the id can delete");
			openSession.delete(entity);
			transaction.commit();
			openSession.close();
			session.close();
		}
		else {
			System.out.println("entity not found");
		}

	}

}

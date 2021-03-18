package com.xworkz.richPerson.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.richPerson.entity.RichEntity;

public class RichPersonDAOImpl implements RichPersonDAO {

	public RichPersonDAOImpl() {
		System.out.println("created RichPersonDAOImpl");
	}

	@Override
	public void create(RichEntity entity) {
		System.out.println("invoked created");
		System.out.println("entity" + entity);
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(RichEntity.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(entity);
		transaction.commit();
		session.close();
		factory.close();

	}

}

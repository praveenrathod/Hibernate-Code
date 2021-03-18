package com.xworkz.brands.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.brands.entity.BrandsEntity;

public class BrandsDAOImpl implements BrandsDAO {

	@Override
	public void CreateEntity(BrandsEntity entity) {
		System.out.println("creating brand entity");
		System.out.println("entity" + entity);
		Configuration configuration = new Configuration().configure().addAnnotatedClass(BrandsEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(entity);
		transaction.commit();
		session.close();
		factory.close();

	}

	@Override
	public BrandsEntity getById(int id) {
		System.out.println("getting brand by id");
		Configuration configuration = new Configuration().configure().addAnnotatedClass(BrandsEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		BrandsEntity entity = session.get(BrandsEntity.class, id);
		if (entity != null) {
			System.out.println("entity found can update");
			transaction.commit();
			session.close();
			factory.close();
		} else {
			System.out.println("entity not found ");
		}

		return entity;
	}

	@Override
	public BrandsEntity UpdateOwnerNameAndGoodProductById(int id, String ownerName, boolean goodProduct) {
		System.out.println("updating owner name and good quality of product by id");
		Configuration configuration = new Configuration().configure().addAnnotatedClass(BrandsEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		BrandsEntity entity = session.get(BrandsEntity.class, id);
		if (entity != null) {
			System.out.println("can update the entity");
			entity.setOwnerName(ownerName);
			entity.setGoodQuality(goodProduct);
			transaction.commit();
			session.update(entity);
			session.close();
			factory.close();
		}

		return entity;
	}

	@Override
	public void deleteById(int id) {
		System.out.println("deleting by id");
		Configuration configuration = new Configuration().configure().addAnnotatedClass(BrandsEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		BrandsEntity entity = session.get(BrandsEntity.class, id);
		if(entity!=null) {
		System.out.println("entity found can delete");
		session.clear();
		session.delete(entity);
		transaction.commit();
		session.close();
		factory.close();
		}else {
			System.out.println("entity cant delete not available the id");
		}
	}

}

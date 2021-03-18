package com.xworkz.icecream.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.xworkz.icecream.entity.iceCreamEntity;

public class iceCreameDAOImpl implements iceCreameDAO {
	EntityManagerFactory factory = null;
	EntityManager manager = null;

	@Override
	public void persist(iceCreamEntity entity) {

		try {
			factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
			manager = factory.createEntityManager();
			manager.getTransaction().begin();
			manager.persist(entity);
			manager.getTransaction().commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {

		}

	}

	@Override
	public void deleteByName(String name) {
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
			EntityManager manager = factory.createEntityManager();
			manager.getTransaction().begin();
			manager.createNamedQuery("deleteByName");
			manager.getTransaction().commit();
			
		} catch (Exception e) {
			manager.close();
			factory.close();
		}

	}

	@Override
	public void updatePriceByName(String name, double price) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager manager2 = factory.createEntityManager();
		manager2.getTransaction().begin();
		Query createNamedQuery = manager2.createNamedQuery("updatePriceByName");
		createNamedQuery.setParameter("pr", price);
		createNamedQuery.setParameter("nm", name);
		createNamedQuery.executeUpdate();
		manager2.getTransaction().commit();
		manager2.close();
		factory.close();

	}

	@Override
	public List<iceCreamEntity> getAll() {
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager entityManager = createEntityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
	    Query query = entityManager.createNamedQuery("getAll");
		query.executeUpdate();
		entityManager.close();
		factory.close();
		return (List<iceCreamEntity>) query;
		
		
	}

	@Override
	public iceCreamEntity findBynameAndPrice(String name, double price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public iceCreamEntity getByMaxPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public iceCreamEntity getByMinPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getBySumPrice() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getPriceByName(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Object[]> getNameAndFlavourByPrice(double price) {
		// TODO Auto-generated method stub
		return null;
	}

}

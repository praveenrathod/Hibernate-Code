package com.xworkz.waterfall.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.waterfall.entity.StateEntity;
import com.xworkz.waterfall.util.SFUtil;

public class StateDAOImpl implements StateDAO {
	SessionFactory factory = SFUtil.getFactory();
	Transaction transaction = null;

	@Override
	public void create(List<StateEntity> entities) {
		System.out.println("creating list of entaties");

		try {
			Session session = factory.openSession();
			transaction = session.beginTransaction();
			for (StateEntity stateEntity : entities) {
				session.save(stateEntity);
			}
			session.flush();
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();

		}

	}

}

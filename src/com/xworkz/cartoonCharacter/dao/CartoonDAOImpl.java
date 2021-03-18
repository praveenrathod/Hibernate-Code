package com.xworkz.cartoonCharacter.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.cartoonCharacter.entity.CartoonEntity;
import com.xworkz.waterfall.util.SFUtil;

public class CartoonDAOImpl implements CartoonDAO {

	SessionFactory factory = SFUtil.getFactory();

	@Override
	public void saveAll(List<CartoonEntity> list) {
		Transaction transaction = null;
		int count = 0;
		try (Session session = factory.openSession()) {
			transaction = session.beginTransaction();
			for (CartoonEntity cartoonEntity : list) {
				session.save(cartoonEntity);
				if (count == 5) {
					session.flush();
					count++;

				}
				count = 0;
			}

			transaction.commit();

		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}

	@Override
	public CartoonEntity findByName(String name) {
		try (Session session = factory.openSession()) {
			String hqlsyntax = "SELECT CART FROM CartoonEntity CART WHERE CART.name='" + name + "'";
			Query<CartoonEntity> query = session.createQuery(hqlsyntax);
			CartoonEntity entity = query.uniqueResult();
			return entity;
		}

	}

	@Override
	public CartoonEntity findByLanguage(String channel, String lang) {
		try (Session session = factory.openSession()) {
			String hqlQueryLang = "SELECT CART FROM CartoonEntity CART WHERE CART.language='" + lang + "' and CART.channelName='"+channel+"'";
			Query<CartoonEntity> enQuery = session.createQuery(hqlQueryLang);
			CartoonEntity entity = enQuery.uniqueResult();
			return entity;
		}

		
	}

}

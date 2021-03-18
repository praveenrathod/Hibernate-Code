package com.xworkz.coupon.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.coupon.entity.CouponEntity;
import com.xworkz.waterfall.util.SFUtil;

public class CouponDAOImpl implements CouponDAO {
	SessionFactory factory = SFUtil.getFactory();

	@Override
	public void createCoupon(CouponEntity entity) {
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			if (entity != null) {
				System.out.println("can create the entity");
				transaction.commit();
				session.close();
			} else {
				System.out.println("cant create the entity");
			}

		}
	}

	@Override
	public CouponEntity getById(int id) {
		CouponEntity entity = null;
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			entity = session.get(CouponEntity.class, id);
			if (entity != null) {
				System.out.println("getting the entity");
				transaction.commit();
				session.close();
			}
		}
		return entity;
	}

	@Override
	public CouponEntity UpdateCodeAndDiscountById(int id, String discount, int code) {
		CouponEntity entity = null;
		try (Session openSession = factory.openSession()) {
			Transaction transaction = openSession.beginTransaction();
			entity = openSession.get(CouponEntity.class, id);
			if (entity != null) {
				System.out.println("updating the code and discount by id");
				entity.setCode(code);
				entity.setDiscount(discount);
				openSession.update(entity);
				transaction.commit();
				openSession.close();
			} else {
				System.out.println("cant updaye the given entity");
			}
		}
		return entity;
	}

	@Override
	public void deleteById(int id) {
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			CouponEntity entity = session.get(CouponEntity.class, id);
			if (entity != null) {
				System.out.println("can delete te entity");
				session.delete(entity);
				transaction.commit();
				session.close();
			} else {
				System.out.println("cant delete the id");
			}
		}

	}

	@Override
	public void createAll(List<CouponEntity> list) {
		Transaction transaction = null;
		try {
			Session openSession = factory.openSession();
			transaction = openSession.beginTransaction();
			for (CouponEntity couponEntity : list) {
				openSession.save(couponEntity);
			}
			openSession.flush();
			transaction.commit();
	

		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		}

	}
}

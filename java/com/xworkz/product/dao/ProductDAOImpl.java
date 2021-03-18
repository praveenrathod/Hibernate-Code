package com.xworkz.product.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.product.entity.ProductEntity;
import com.xworkz.product.entity.ProductEntity.ProductType;
import com.xworkz.waterfall.util.SFUtil;

public class ProductDAOImpl implements ProductDAO {
	private SessionFactory factory = SFUtil.getFactory();

	@Override
	public void persist(ProductEntity entity) {
		Transaction transaction = null;
		try (Session session = factory.openSession()) {
			transaction = session.beginTransaction();
			session.save(entity);
			if (entity != null) {
				System.out.println("can crreate entity");
				transaction.commit();
			} else {
				System.out.println("cant create entity");
			}
		} catch (Exception e) {
			transaction.rollback();
		}
	}

	@Override
	public ProductEntity findByNameAndManufacturer(String name, String manufacturer) {
		try (Session session = factory.openSession()) {
			String hqlquery = "select pro from ProductEntity pro where pro.name=:nm and pro.manufacturer=:mf";
			Query<ProductEntity> query = session.createQuery(hqlquery);
			query.setParameter("nm", name);
			query.setParameter("mf", manufacturer);
			ProductEntity uniqueResult = query.uniqueResult();
			System.out.println(uniqueResult);
			return uniqueResult;
		}

	}

	@Override
	public ProductEntity findbyTypeAndBrandAndName(String name, ProductType type, String brand) {
		try (Session session = factory.openSession()) {
			String hqlquery = "select pro from ProductEntity pro where pro.name=:nm and pro.brand=:bd and pro.type=:tp";
			Query<ProductEntity> query = session.createQuery(hqlquery);
			query.setParameter("nm", name);
			query.setParameter("bd", brand);
			query.setParameter("tp", type);
			ProductEntity uniqueResult = query.uniqueResult();
			System.out.println(uniqueResult);
			return uniqueResult;
		}
	}

	@Override
	public Double findPriceByTypeAndBrandName(String name, String brand, ProductType type) {
		try (Session session = factory.openSession()) {
			String hqlquery = "select pro.price from ProductEntity pro where pro.name=:nm and pro.brand=:bd and pro.type=:tp";
			Query<Double> query = session.createQuery(hqlquery);
			query.setParameter("nm", name);
			query.setParameter("bd", brand);
			query.setParameter("tp", type);
			double uniqueResult = query.uniqueResult();
			System.out.println(uniqueResult);
			return uniqueResult;
		}
	}

	@Override
	public Object[] findPriceAndQuantityByTypeAndBrandAndName(String name, String brand, ProductType type) {
		try (Session session = factory.openSession()) {
			String hqlquery = "select pro.price,pro.quantity from ProductEntity pro where pro.name=:nm and pro.brand=:bd and pro.type=:tp";
			Query<Object[]> query = session.createQuery(hqlquery);
			query.setParameter("nm", name);
			query.setParameter("bd", brand);
			query.setParameter("tp", type);
			Object[] uniqueResult = query.uniqueResult();
			return uniqueResult;
		}
	}

	@Override
	public ProductEntity finByTypeAndBrandAndQuality(ProductType type, String brand, boolean quality) {
		try (Session session = factory.openSession()) {
			String hqlquery = "select pro from ProductEntity pro where pro.type=:tp and pro.brand=:bd and pro.quality=:qt";
			Query<ProductEntity> query = session.createQuery(hqlquery);
			query.setParameter("qt", quality);
			query.setParameter("bd", brand);
			query.setParameter("tp", type);
			ProductEntity uniqueResult = query.uniqueResult();
			System.out.println(uniqueResult);
			return uniqueResult;
		}
	}

	@Override
	public Object[] findNameAndTypeByid(int id) {
		try (Session session = factory.openSession()) {
			String hqlquery = "select pro.name, pro.type from ProductEntity pro where pro.id=:id";
			Query<Object[]> query = session.createQuery(hqlquery);
			query.setParameter("id", id);
			Object[] uniqueResult = query.uniqueResult();
			return uniqueResult;
		}
	}

	@Override
	public int FindMaxId() {
		try (Session session = factory.openSession()) {
			String hqlquery = "select max(id) from ProductEntity";
			Query<Integer> query = session.createQuery(hqlquery);
			Integer uniqueResult = query.uniqueResult();
			System.out.println(uniqueResult);
			return uniqueResult;
		}
	}

	@Override
	public long findSize() {
		try (Session session = factory.openSession()) {
			String hqlquery = "select count(*) from ProductEntity";
			Query<Long> query = session.createQuery(hqlquery);
			Long uniqueResult = query.uniqueResult();
			System.out.println(uniqueResult);
			return uniqueResult;
		}

	}

	@Override
	public double findMaxPrice() {
		try (Session session = factory.openSession()) {
			String hqlquery = "select max(price) from ProductEntity";
			Query<Double> query = session.createQuery(hqlquery);
			Double uniqueResult = query.uniqueResult();
			System.out.println(uniqueResult);
			return uniqueResult;
		}
	}

	@Override
	public double findSumOfPrice() {
		try (Session session = factory.openSession()) {
			String hqlquery = "select sum(price) from ProductEntity";
			Query<Double> query = session.createQuery(hqlquery);
			Double uniqueResult = query.uniqueResult();
			System.out.println(uniqueResult);
			return uniqueResult;
		}
	}

	@Override
	public int findMinId() {
		try (Session session = factory.openSession()) {
			String hqlquery = "select min(id) from ProductEntity";
			Query<Integer> query = session.createQuery(hqlquery);
			Integer uniqueResult = query.uniqueResult();
			System.out.println(uniqueResult);
			return uniqueResult;
		}
	}

	@Override
	public ProductEntity findDistinct() {
		try (Session session = factory.openSession()) {
			String hqlquery = "select distinct name, type,brand from ProductEntity";
			Query<ProductEntity> query = session.createQuery(hqlquery);
			ProductEntity uniqueResult = query.uniqueResult();
			System.out.println(uniqueResult);
			return uniqueResult;
		}
	}

}

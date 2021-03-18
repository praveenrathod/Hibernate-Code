package com.xworkz.coupon;

import java.util.ArrayList;

import com.xworkz.coupon.dao.CouponDAO;
import com.xworkz.coupon.dao.CouponDAOImpl;
import com.xworkz.coupon.entity.CouponEntity;

public class CouponTester {

	public static void main(String[] args) {
	CouponEntity entity=new CouponEntity(1, "ZOMATO50", 8756215, 1,"50");
	
	CouponDAO dao=new CouponDAOImpl();
	//dao.createCoupon(entity);

	

	CouponEntity entity4=new CouponEntity(5, "danzo90", 5862, 6,"89");
	CouponEntity entity3=new CouponEntity(4, "ZOMATO50", 8756215, 8,"59");
	
	ArrayList<CouponEntity> list=new ArrayList<CouponEntity>();
	
	list.add(entity4);
	list.add(entity3);
	
	//dao.createAll(list);
	
	//dao.deleteById(4);
	
	dao.UpdateCodeAndDiscountById(3,"8", 1234);
	}

}

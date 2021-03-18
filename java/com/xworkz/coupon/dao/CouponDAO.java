package com.xworkz.coupon.dao;

import java.util.List;

import com.xworkz.coupon.entity.CouponEntity;

public interface CouponDAO {

	
	public void createCoupon(CouponEntity entity);
	
	public CouponEntity getById(int id);
	
	public CouponEntity UpdateCodeAndDiscountById(int id, String discount,int code);
	
	public void deleteById(int id);
	
	public void createAll(List<CouponEntity>list);
}

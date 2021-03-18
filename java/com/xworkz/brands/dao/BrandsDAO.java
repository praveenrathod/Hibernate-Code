package com.xworkz.brands.dao;

import com.xworkz.brands.entity.BrandsEntity;

public interface BrandsDAO {

	public void CreateEntity(BrandsEntity entity);
	
	public BrandsEntity getById(int id);
	
	public BrandsEntity UpdateOwnerNameAndGoodProductById(int id, String ownerName,boolean goodProduct);
	
	public void deleteById(int id);
}

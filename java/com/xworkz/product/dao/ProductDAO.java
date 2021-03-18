package com.xworkz.product.dao;

import com.xworkz.product.entity.ProductEntity;
import com.xworkz.product.entity.ProductEntity.ProductType;

public interface ProductDAO {

	public void persist(ProductEntity entity);

	public ProductEntity findByNameAndManufacturer(String name, String manufacturer);

	public ProductEntity findbyTypeAndBrandAndName(String name, ProductType type, String brand);

	public Double findPriceByTypeAndBrandName(String name, String brand, ProductType type);

	public Object[] findPriceAndQuantityByTypeAndBrandAndName(String name, String brand, ProductType type);

	public ProductEntity finByTypeAndBrandAndQuality(ProductType type, String brand, boolean quality);

	public Object[] findNameAndTypeByid(int id);

	public int FindMaxId();

	public long findSize();

	public double findMaxPrice();

	public double findSumOfPrice();

	public int findMinId();

	public ProductEntity findDistinct();

}

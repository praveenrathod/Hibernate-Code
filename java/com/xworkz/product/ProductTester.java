package com.xworkz.product;

import com.xworkz.product.dao.ProductDAO;
import com.xworkz.product.dao.ProductDAOImpl;
import com.xworkz.product.entity.ProductEntity;
import com.xworkz.product.entity.ProductEntity.ProductType;

public class ProductTester {
	public static void main(String[] args) {

		ProductEntity entity = new ProductEntity(1, "IDEAPAD320", ProductType.COMPUTERS, 4000, 3, true, "LENOVO LTD.",
				"LENOVO");
		ProductEntity entity2 = new ProductEntity(1, "NIKE", ProductType.FASHION, 4000, 3, true, "NIKE INDIA.", "NIKE");
		ProductEntity entity3 = new ProductEntity(1, "Fridge", ProductType.HOME_APPLIANCES, 2000, 3, false, "LG IND.",
				"LG");

		ProductDAO dao = new ProductDAOImpl();
		//dao.persist(entity2);
		// dao.persist(entity);
		//dao.persist(entity3);

		//dao.findByNameAndManufacturer("IDEAPAD320", "LENOVO LTD.");
		
		//dao.findbyTypeAndBrandAndName("Fridge", ProductType.HOME_APPLIANCES, "LG");
		
	//	dao.findPriceByTypeAndBrandName("Fridge", "LG", ProductType.HOME_APPLIANCES);
		
//		Object[] findPriceAndQuantityByTypeAndBrandAndName = dao.findPriceAndQuantityByTypeAndBrandAndName("NIKE", "NIKE", ProductType.FASHION);
//		System.out.println(findPriceAndQuantityByTypeAndBrandAndName[0]);
		
		//dao.finByTypeAndBrandAndQuality(ProductType.COMPUTERS, "LENOVO", true);
	
//		Object[] findNameAndTypeByid = dao.findNameAndTypeByid(3);
//		System.out.println(findNameAndTypeByid[1]);
		
//		int findMaxId = dao.FindMaxId();
//		System.out.println(findMaxId);
		
//		double maxPrice = dao.findMaxPrice();
//		System.out.println(maxPrice);
		
//		double findMinId = dao.findMinId();
//		System.out.println(findMinId);
		
//		double findSumOfPrice = dao.findSumOfPrice();
//		System.out.println(findSumOfPrice);
		
//		long size = dao.findSize();
//		System.out.println(size);
		
		ProductEntity findDistinct = dao.findDistinct();
		System.out.println(findDistinct);

	}
}

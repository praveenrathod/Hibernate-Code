package com.xworkz.brands;

import com.xworkz.brands.dao.BrandsDAO;
import com.xworkz.brands.dao.BrandsDAOImpl;
import com.xworkz.brands.entity.BrandsEntity;

public class BrandTester {

	public static void main(String[] args) {
		BrandsEntity entity=new BrandsEntity();
		entity.setId(1);
		entity.setName("Nike");
		entity.setOriginCountry("USA");
		entity.setFamousFor("Shoes");
		entity.setOwnerName("Phil Knight");
		entity.setGoodQuality(true);
		
		
			BrandsEntity entity2=new BrandsEntity();
//			entity.setId(1);
			entity2.setName("puma");
			entity2.setOriginCountry("German");
			entity2.setFamousFor("athletic clothes");
			entity2.setOwnerName("Rudolf Dassler");
			entity2.setGoodQuality(true);
			
			BrandsEntity entity3=new BrandsEntity();
//			entity.setId(1);
			entity3.setName("levi's");
			entity3.setOriginCountry("California");
			entity3.setFamousFor("Clothes");
			entity3.setOwnerName("Levi Strauss");
			entity3.setGoodQuality(true);
		
		BrandsDAO dao=new BrandsDAOImpl();
//		dao.CreateEntity(entity);
//		dao.CreateEntity(entity2);
//		dao.CreateEntity(entity3);
		
		BrandsEntity byId = dao.getById(3);
		System.out.println(byId);
		
		BrandsEntity updateOwnerNameAndGoodProductById = dao.UpdateOwnerNameAndGoodProductById(4, "Levis", false);
		System.out.println(updateOwnerNameAndGoodProductById);
		
		dao.deleteById(2);
		dao.deleteById(5);
		dao.deleteById(6);
		dao.deleteById(7);
		dao.deleteById(8);
		dao.deleteById(9);
		dao.deleteById(10);
		
	}

}

package com.xworkz.cartoonCharacter.dao;

import java.util.List;

import com.xworkz.cartoonCharacter.entity.CartoonEntity;

public interface CartoonDAO {

	public void saveAll(List<CartoonEntity> list);
	
	public CartoonEntity findByName(String name);
	
	public CartoonEntity findByLanguage(String channel, String lang);
}

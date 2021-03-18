package com.xworkz.disasters.dao;

import java.util.List;

import com.xworkz.disasters.entity.DisastersEntity;

public interface DisastersDAO {

	public void CreateDisaster(DisastersEntity entity);

	public DisastersEntity getById(int id);

	public DisastersEntity updateDangereousLevelAndNameById(int id, String name, int dangereosLevel);

	public void deleteById(int id);
	
	public void create(List<DisastersEntity> entities);
}

package com.studypointsystem.studypoint.service;

import java.util.List;

import com.studypointsystem.studypoint.entity.Canteen;

public interface CanteenService {
	
	public List<Canteen> getAllItem();
	
	public Canteen getItem(int itemId);

	public Canteen addItem(Canteen canteen);
	
	public Canteen updateItem(Canteen canteen);
	
	public void deleteItem(int itemId);

}

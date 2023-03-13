package com.studypointsystem.studypoint.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studypointsystem.studypoint.entity.Canteen;
import com.studypointsystem.studypoint.repository.CanteenRepository;

@Service
public class CanteenServiceImpl implements CanteenService {
	
	@Autowired
	private CanteenRepository canteenRepository;

	@Override
	public List<Canteen> getAllItem() {
		
		return this.canteenRepository.findAll();
	}

	@Override
	public Canteen addItem(Canteen canteen) {
		
		canteenRepository.save(canteen);
		return canteen;
	}

	@Override
	public Canteen updateItem(Canteen canteen) {
		
		canteenRepository.save(canteen);
		return canteen;
	}

	@Override
	public void deleteItem(int itemId) {
		
		Optional<Canteen> entity =  canteenRepository.findById(itemId);
		Canteen foundCanteen = entity.get();
		canteenRepository.delete(foundCanteen);
		
	}
	@Override
	public Canteen getItem(int itemId) {
		Optional<Canteen> entity =  canteenRepository.findById(itemId);
		Canteen foundCanteen = entity.get();
		return foundCanteen;
		
	}
}

package com.studypointsystem.studypoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.studypointsystem.studypoint.entity.Canteen;
import com.studypointsystem.studypoint.service.CanteenService;

@RestController
public class CanteenController {
	
	@Autowired
	public CanteenService canteenService;
	
	@GetMapping("/items")
	@ResponseBody
	public List<Canteen> getAllCanteen(){
		return this.canteenService.getAllItem();
	}
	
	@PostMapping("/item")
	public Canteen addCanteen(@RequestBody Canteen canteen) {
		
		return this.canteenService.addItem(canteen);
	}
	
	@PutMapping("/item")
	public Canteen updateUser(@RequestBody Canteen canteen) {
		return this.canteenService.updateItem(canteen);
	}
	
	@GetMapping("/item/{itemId}")
	public Canteen getItem(@PathVariable int itemId) {
		return this.canteenService.getItem(itemId);
	}
	
	@DeleteMapping("/item/{itemId}")
	public ResponseEntity<HttpStatus>deleteUser(@PathVariable int itemId)
	{
		try {
			this.canteenService.deleteItem(itemId);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}

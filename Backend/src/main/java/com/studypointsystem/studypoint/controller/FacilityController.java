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

import com.studypointsystem.studypoint.entity.Facility;
import com.studypointsystem.studypoint.service.FacilityService;

@RestController
public class FacilityController {
	
	@Autowired
	public FacilityService facilityService;
	
	@GetMapping("/facilities")
	@ResponseBody
	public List<Facility> getAllFacility(){
		return this.facilityService.getAllFacility();
	}
	
	@PostMapping("/facility")
	public Facility addFacility(@RequestBody Facility facility) {
		
		return this.facilityService.addFacility(facility);
	}
	@PutMapping("/facility")
	public Facility updateUser(@RequestBody Facility facility) {
		return this.facilityService.updateFacility(facility);
	}
	
	@GetMapping("/facility/{facilityId}")
	public Facility getUser (@PathVariable int facilityId) {
		
		return this.facilityService.getFacility(facilityId);
	}
	
	
	@DeleteMapping("/facility/{facilityId}")
	public ResponseEntity<HttpStatus>deleteFacility(@PathVariable int facilityId)
	{
		try {
			this.facilityService.deleteFacility(facilityId);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}



package com.studypointsystem.studypoint.service;

import java.util.List;

import com.studypointsystem.studypoint.entity.Facility;

public interface FacilityService {
	
    public List<Facility> getAllFacility();
	
	public Facility getFacility(int facilityId);

	public Facility addFacility(Facility facility);
	
	public Facility updateFacility(Facility facility);
	
	public void deleteFacility(int facilityId);


}

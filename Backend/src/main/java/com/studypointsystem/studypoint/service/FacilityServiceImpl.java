package com.studypointsystem.studypoint.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studypointsystem.studypoint.entity.Facility;
import com.studypointsystem.studypoint.repository.FacilityRepository;

@Service
public class FacilityServiceImpl implements FacilityService {
	
	@Autowired
	private FacilityRepository facilityRepository;

	@Override
	public List<Facility> getAllFacility() {
		
		return facilityRepository.findAll();
	}

	@Override
	public Facility addFacility(Facility facility) {
		
		facilityRepository.save(facility);
		return facility;
	}

	@Override
	public Facility updateFacility(Facility facility) {
		
		facilityRepository.save(facility);
		return facility;
	}

	@Override
	public void deleteFacility(int facilityId) {
		
		Optional<Facility> entity = facilityRepository.findById(facilityId);
		Facility foundFacility = entity.get();
		facilityRepository.delete(foundFacility);
		}
	
	@Override
	public Facility getFacility(int facilityId) {
		
		Optional<Facility> entity = facilityRepository.findById(facilityId);
		Facility foundFacility = entity.get();
		return foundFacility;
	}

}

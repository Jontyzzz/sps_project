package com.studypointsystem.studypoint.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studypointsystem.studypoint.entity.Resource;
import com.studypointsystem.studypoint.repository.ResourceRepository;

@Service
public class ResourceServiceImpl implements ResourceService {
	
	@Autowired
	private ResourceRepository resourceRepository;

	@Override
	public List<Resource> getAllResource() {
		return this.resourceRepository.findAll();		
	}
  
	@Override
	public Resource addResource(Resource resource) {
		
		resourceRepository.save(resource);
		return resource;
	}

	@Override
	public Resource updateResource(Resource resource) {
		resourceRepository.save(resource);
		return resource;
	}

	@Override
	public void deleteResource(int resourceId) {
		Optional<Resource> entity = resourceRepository.findById(resourceId);
		Resource foundResource = entity.get();
		resourceRepository.delete(foundResource);
		}
	
	@Override
	public Resource getResource(int resourceId) {

			Optional<Resource> entity = resourceRepository.findById(resourceId);
			Resource foundResource= entity.get();
			return foundResource;
		
	}
	

}

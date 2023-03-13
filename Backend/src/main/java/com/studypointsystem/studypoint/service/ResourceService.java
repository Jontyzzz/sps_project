package com.studypointsystem.studypoint.service;

import java.util.List;

import com.studypointsystem.studypoint.entity.Resource;

public interface ResourceService {

public List<Resource> getAllResource();
	
	public Resource getResource(int resourceId);

	public Resource addResource(Resource resource);
	
	public Resource updateResource(Resource resource);
	
	public void deleteResource(int resourceId);
}

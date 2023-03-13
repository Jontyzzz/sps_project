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

import com.studypointsystem.studypoint.entity.Resource;
import com.studypointsystem.studypoint.service.ResourceService;

@RestController
public class ResourceController {
	
	@Autowired
	public ResourceService resourceService;
	
	@GetMapping("/resources")
	@ResponseBody
	public List<Resource>getAllResource() {
		return this.resourceService.getAllResource();
	}
	
	@PostMapping("/resource")
	public Resource addResource(@RequestBody Resource resource) {
		 
		return this.resourceService.addResource(resource);
	}
	
	@PutMapping("/resource")
	public Resource updateResource(@RequestBody Resource resource) {
		return this.resourceService.updateResource(resource);
	}
	
	@GetMapping("/resource/{resourceId}")
	public Resource getResource (@PathVariable int resourceId) {
		
		return this.resourceService.getResource(resourceId);
	}
	
	
	@DeleteMapping("/resource/{resourceId}")
	public ResponseEntity<HttpStatus>deleteResource(@PathVariable int resourceId)
	{
		try {
			this.resourceService.deleteResource(resourceId);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
	
	

}

package com.studypointsystem.studypoint.controller;

import java.util.ArrayList;
import java.util.Arrays;
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

import com.studypointsystem.studypoint.entity.LabAdmin;
import com.studypointsystem.studypoint.service.LabAdminService;

@RestController
public class LabAdminController {

	@Autowired
	public LabAdminService labAdminService;
	
	@GetMapping("/labadmins")
	@ResponseBody
	public List<LabAdmin> getAllLabAdmin(){
		//System.out.println(this.labAdminService.getAllLabAdmin());
		return this.labAdminService.getAllLabAdmin();
	}
	
	@PostMapping("/labadmin")
	public LabAdmin addLabAdmin(@RequestBody LabAdmin labAdmin) {
		
		return this.labAdminService.addLabAdmin(labAdmin);
	}
	
	@GetMapping("/labadmin/{labAdminId}")
	public LabAdmin getLabAdmin(@PathVariable int labAdminId) {
		return this.labAdminService.getLabAdmin(labAdminId);
	}
	
	@PutMapping("/labadmin")
	public LabAdmin updateLabAdmin(@RequestBody LabAdmin labAdmin){
		return this.labAdminService.updateLabAdmin(labAdmin);
	}
	
	@DeleteMapping("/labadmin/{labAdminId}")
	public ResponseEntity<HttpStatus> deleteLabAdmin(@PathVariable int labAdminId){
		try {
			this.labAdminService.deleteLabAdmin(labAdminId);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}

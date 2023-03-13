package com.studypointsystem.studypoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.studypointsystem.studypoint.entity.Library;
import com.studypointsystem.studypoint.service.LibraryService;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class LibraryController {
	
	@Autowired
	public LibraryService libraryService;
	
	@GetMapping("/libraries")
	@ResponseBody
	public List<Library>getAllLibrary(){
		
		return this.libraryService.getAllLibrary();
	}
	
	@PostMapping("/library")
	public Library addLibrary(@RequestBody Library library) {
		return this.libraryService.addLibrary(library);
	}
	
	@PutMapping("/library")
	public Library updateLibrary(@RequestBody Library library) {
		return this.libraryService.updateLibrary(library);
	}
	
	@GetMapping("/library/{libraryId}")
	public Library getLibrary (@PathVariable int libraryId) {
		
		return this.libraryService.getLibrary(libraryId);
	}
	
	@DeleteMapping("/library/{libraryId}")
	public ResponseEntity<HttpStatus>deleteLibrary(@PathVariable int libraryId)
	{
		try {
			this.libraryService.deleteLibrary(libraryId);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
}

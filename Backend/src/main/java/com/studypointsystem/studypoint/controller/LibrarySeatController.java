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

import com.studypointsystem.studypoint.entity.LibrarySeat;
import com.studypointsystem.studypoint.service.LibrarySeatService;

@RestController
public class LibrarySeatController {
	
	@Autowired
	public LibrarySeatService librarySeatService;
	
	@GetMapping("/libraryseats")
	@ResponseBody
	public List<LibrarySeat>getAllLibrarySeat(){
		
		return this.librarySeatService.getAllLibrarySeat();
	}
	
	@PostMapping("/libraryseat")
	public LibrarySeat addLibrarySeat(@RequestBody LibrarySeat librarySeat) {
		return this.librarySeatService.addLibrarySeat(librarySeat);
	}
	
	@PutMapping("/libraryseat")
	public LibrarySeat updateLibrarySeat(@RequestBody LibrarySeat LibrarySeat) {
		return this.librarySeatService.updateLibrarySeat(LibrarySeat);
	}
	
	@GetMapping("/libraryseat/{seatId}")
	public LibrarySeat getLibrarySeat (@PathVariable int seatId) {
		return this.librarySeatService.getLibrarySeat(seatId);
	}
	
	
	@DeleteMapping("/libraryseat /{seatId}")
	public ResponseEntity<HttpStatus> deleteLibrarySeat(@PathVariable int seatId)
	{
		try {
			this.librarySeatService.deleteLibrarySeat(seatId);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


}

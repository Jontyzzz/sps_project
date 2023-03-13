package com.studypointsystem.studypoint.controller;

import java.util.List;

import javax.validation.Valid;

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

import com.studypointsystem.studypoint.entity.User;
import com.studypointsystem.studypoint.service.UserService;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class UserController {
	
	@Autowired
	public UserService userService;
	
	@GetMapping("/users")
	@ResponseBody
	public List<User> getAllUser(){
		return this.userService.getAllUser();
	}
	
	@PostMapping("/user")
	public User addUser(@Valid @RequestBody User user) {
		
		return this.userService.addUser(user);
	}
	
	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		return this.userService.updateUser(user);
	}
	
	@GetMapping("/user /{userId}")
	public User getUser (@PathVariable String userId) {
		
		return this.userService.getUser(userId);
	}
	
	
	@DeleteMapping("/user /{userId}")
	public ResponseEntity<HttpStatus>deleteUser(@PathVariable String userId)
	{
		try {
			this.userService.deleteUser(userId);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}

package com.studypointsystem.studypoint.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.studypointsystem.studypoint.entity.User;
import com.studypointsystem.studypoint.entity.UserLogin;
import com.studypointsystem.studypoint.service.UserService;


@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class LoginController {

	@Autowired
	public UserService userService;
	
	
	@PostMapping("/users/login")
	@ResponseBody
	public UserLogin getUser(@RequestBody UserLogin userLogin) {
		System.out.println(userLogin);
		List<User> tempUser = this.userService.getAllUser();
		System.out.println(tempUser);
		for(User user : tempUser){
			if(userLogin.getUserId().equals(user.getUserId()) && userLogin.getPassword().equals(user.getPassword())) {
				return userLogin;
			}
		}
		UserLogin tempUserLogin = new UserLogin();
		return tempUserLogin;
		
	}
	
}

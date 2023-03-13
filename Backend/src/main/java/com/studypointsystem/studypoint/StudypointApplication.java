package com.studypointsystem.studypoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studypointsystem.studypoint.controller.LabAdminController;

@SpringBootApplication
public class StudypointApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudypointApplication.class, args);
//		LabAdminController labAdminController = new LabAdminController();
//		labAdminController.getAllLabAdmin();
	}

}

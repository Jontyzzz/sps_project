package com.studypointsystem.studypoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studypointsystem.studypoint.entity.LabAdmin;

@Repository
public interface LabAdminRepository extends JpaRepository<LabAdmin, Integer> {
	
}

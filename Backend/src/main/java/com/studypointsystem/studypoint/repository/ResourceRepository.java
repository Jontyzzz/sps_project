package com.studypointsystem.studypoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studypointsystem.studypoint.entity.Resource;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Integer>{
	

}

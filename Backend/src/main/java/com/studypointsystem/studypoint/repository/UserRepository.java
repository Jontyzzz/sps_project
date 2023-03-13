package com.studypointsystem.studypoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studypointsystem.studypoint.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	

}

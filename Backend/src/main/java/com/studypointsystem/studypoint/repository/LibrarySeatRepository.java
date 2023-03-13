package com.studypointsystem.studypoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studypointsystem.studypoint.entity.LibrarySeat;

@Repository
public interface LibrarySeatRepository extends JpaRepository<LibrarySeat, Integer> {

}

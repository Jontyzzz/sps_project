
package com.studypointsystem.studypoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studypointsystem.studypoint.entity.Canteen;

@Repository
public interface CanteenRepository extends JpaRepository<Canteen, Integer> {

}

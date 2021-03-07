package com.assignment.mvc;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GymRepository extends JpaRepository<Gym, Integer> {
	
}


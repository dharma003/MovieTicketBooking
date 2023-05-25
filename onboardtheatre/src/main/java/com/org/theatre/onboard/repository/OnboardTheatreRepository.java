package com.org.theatre.onboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.org.theatre.onboard.model.TheatreDetails;

public interface OnboardTheatreRepository extends JpaRepository<TheatreDetails, Long>,JpaSpecificationExecutor<TheatreDetails>{
	
	List<TheatreDetails> findByTheatreName(String theatreName);
	

}

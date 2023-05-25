package com.org.theatre.onboard.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.theatre.onboard.model.TheatreDetails;
import com.org.theatre.onboard.service.OnboardTheatureService;

@RestController
public class OnboardTheatreController {
	
	
	@Autowired
	private OnboardTheatureService onboardTheatureServiceImpl;
	
	private static Logger logger = LoggerFactory.getLogger(OnboardTheatreController.class);
	
	@Value("${discount.percentage}")
	private String discountPercentage;
	
	@GetMapping("/health")
	public String getHealthCheck() {
		
		System.out.println("discountPercentage " + discountPercentage);
		
		logger.info("Health check");
		
		return "Applications up and running";
		
	}
	
	
	@PostMapping("/onboardtheatre")
	ResponseEntity<String> saveTheatureDetails(@RequestBody  TheatreDetails theatreDetails){
		
		
		String searchResponse  = onboardTheatureServiceImpl.saveTheatres(theatreDetails);
		
		logger.info("get search Response {} ",searchResponse);
		
		
		return new ResponseEntity<>(searchResponse , HttpStatus.ACCEPTED);
		
	}

}

package com.org.theatre.onboard.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.org.theatre.onboard.model.TheatreDetails;
import com.org.theatre.onboard.repository.OnboardTheatreRepository;

@Service
public class OnboardTheatureServiceImpl implements OnboardTheatureService{

	private static Logger logger = LoggerFactory.getLogger(OnboardTheatureServiceImpl.class);

	
	@Value("${discount.percentage}")
	private String discountPercentage;
	
	@Autowired
	private OnboardTheatreRepository onboardTheatreRepository;
	
	@Override
	public boolean onboardTheature() {
		
		
		logger.info("discount percentage: {}",discountPercentage);
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String saveTheatres(TheatreDetails theatreDetails) {
		
		
		try {
		onboardTheatreRepository.save(theatreDetails);
		}catch(Exception exp) {
			
			logger.error("Exception while onboarding the theatre {} ",exp.getMessage());
			
		}
		
		return "successfully onboarded theatres";
	}

}

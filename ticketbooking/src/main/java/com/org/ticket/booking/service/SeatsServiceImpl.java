package com.org.ticket.booking.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.org.ticket.booking.model.Seats;
import com.org.ticket.booking.repository.SeatsRepository;

@Service
public class SeatsServiceImpl implements SeatsService {

	 
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Autowired
	private SeatsRepository seatsRepository;

	@Override
	public String saveSeats(Seats seats) {

		seatsRepository.save(seats);

		return "successfully saved ";
	}

	@Override
	public List<Optional<Seats>> getSeatsDetails(String movieName) {
		
		Optional<Seats> Seats = seatsRepository.findById("643bf85e2091bc28afc3ba3b");
		
		
		List <Optional<Seats>> SeatsList = new ArrayList<>();
		
		SeatsList.add(Seats);
		//Query query = new Query();

		//query.addCriteria(Criteria.where("movieName").is(movieName));
		//List<Seats> Seats = mongoTemplate.find(query, Seats.class);

		return SeatsList;

	}

}

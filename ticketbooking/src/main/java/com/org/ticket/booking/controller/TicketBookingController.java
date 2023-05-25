package com.org.ticket.booking.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.ticket.booking.model.SearchRequest;
import com.org.ticket.booking.model.SearchResponse;
import com.org.ticket.booking.model.Seats;
import com.org.ticket.booking.service.SearchMovieService;
import com.org.ticket.booking.service.SeatsService;

@RestController
public class TicketBookingController {
	
	
	@Autowired
	private SearchMovieService searchMovieServiceImpl;
	
	@Autowired
	private SeatsService seatsServiceImpl;
	
	private static Logger logger = LoggerFactory.getLogger(TicketBookingController.class);
	
	@Value("${discount.percentage}")
	private String discountPercentage;
	
	@GetMapping("/health")
	public String getHealthCheck() {
		
		System.out.println("discountPercentage " + discountPercentage);
		
		logger.info("Health check");
		
		return "Applications up and running";
		
	}
	
	
	@GetMapping("/searchmovie")
	ResponseEntity<SearchResponse> getMovieDetails(@RequestBody  SearchRequest searchRequest){
		
		
		SearchResponse searchResponse  = searchMovieServiceImpl.getMovieDetails(searchRequest);
		
		logger.info("get search Response {} ",searchResponse);
		
		
		return new ResponseEntity<>(searchResponse , HttpStatus.ACCEPTED);
		
	}
	
	
	@PostMapping("/book")
	ResponseEntity<SearchResponse> bookTickets(@RequestBody  SearchRequest searchRequest){
		
		
		SearchResponse searchResponse  = searchMovieServiceImpl.getMovieDetails(searchRequest);
		
		logger.info("get search Response {} ",searchResponse);
		
		
		return new ResponseEntity<>(searchResponse , HttpStatus.ACCEPTED);
		
	}
	
	
	@PostMapping("/saveSeats")
	ResponseEntity<String> saveSeats(@RequestBody Seats seats) {

		String saveResponse = seatsServiceImpl.saveSeats(seats);

		logger.info("save Response {} ", saveResponse);

		return new ResponseEntity<>(saveResponse, HttpStatus.ACCEPTED);

	}
	
	@GetMapping("/checkAvailability")
	ResponseEntity<List<Optional<Seats>>> checkAvailability(@RequestParam String movieName) {

		List<Optional<Seats>> saveResponse = seatsServiceImpl.getSeatsDetails(movieName);

		logger.info("save Response {} ", saveResponse);

		return new ResponseEntity<>(saveResponse, HttpStatus.ACCEPTED);

	}

}

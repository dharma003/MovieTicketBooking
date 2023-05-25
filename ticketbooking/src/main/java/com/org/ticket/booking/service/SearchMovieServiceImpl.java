package com.org.ticket.booking.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.ticket.booking.controller.TicketBookingController;
import com.org.ticket.booking.model.MovieInfo;
import com.org.ticket.booking.model.SearchRequest;
import com.org.ticket.booking.model.SearchResponse;
import com.org.ticket.booking.model.TheatreDetails;
import com.org.ticket.booking.repository.OnboardTheatreRepository;

@Service
public class SearchMovieServiceImpl implements SearchMovieService{

	private static Logger logger = LoggerFactory.getLogger(TicketBookingController.class);

	
	@Autowired 
	private OnboardTheatreRepository onboardTheatureRepository;
	
	
	@Override
	public SearchResponse getMovieDetails(SearchRequest searchRequest) {
		
		logger.info("getMovieDetails");
		
		SearchResponse response = new SearchResponse();
		List<MovieInfo> movies = new ArrayList<>();
		
		List<TheatreDetails> list = onboardTheatureRepository.findByTheatreName(searchRequest.getTheatreName());
			
		list.stream().forEach(t ->{
			
			response.setTheatreName(t.getTenantName());
			t.getMovieList().stream().forEach(m ->{
				
				MovieInfo movie = new MovieInfo();
				
				movie.setLocation(t.getCity());
				movie.setMovieLaunguage(m.getLaunguage());
				movie.setMovieName(m.getMovieName());
				movie.setShowTime(m.getShowTime());
				movie.setScreenName(m.getScreenName());
				
				movies.add(movie);
			});
			
			response.setMovies(movies);
			
		});
		
		return response;
	}

}

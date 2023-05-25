package com.org.theatre.onboard.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;

public class SampleJsonConverter {
	
	
	public static void main(String ...s) {
		
		
		TheatreDetails theatreDetails = new TheatreDetails();
		
		List<Movies> movieList = new ArrayList<>();
		
		
		Movies movie  = new Movies();
		movie.setAvilability("Yes");
		movie.setEndDate(new Date());
		movie.setEndDate(new Date());
		movie.setId(1L);
		movie.setMovieName("Avathar");
		movie.setLaunguage("English");
		movieList.add(movie);
		theatreDetails.setId(1L);
		theatreDetails.setCity("chennai");
		theatreDetails.setDeluxe(50L);
		theatreDetails.setFirstClass(50L);
		theatreDetails.setScreensCount(5L);
		theatreDetails.setSeatsCapacity(200L);
		theatreDetails.setSecondClass(100L);
		theatreDetails.setTenantName("Inox");
		theatreDetails.setTheatreName("Inox");
		theatreDetails.setMovieList(movieList);
		
		
		System.out.println(new Gson().toJson(theatreDetails));;
		
	}

}

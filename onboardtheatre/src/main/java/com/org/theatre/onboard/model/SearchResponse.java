package com.org.theatre.onboard.model;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class SearchResponse {
	
	private String theatreName;
	private String location;
	private Date bookingDate;
	private String movieName;
	private String mobileNumber;
	private String showTime; //morning or afternoon or evening or night or midnight;
	private String movieLaunguage;
	private List<TheatreDetails> theatreList;
}

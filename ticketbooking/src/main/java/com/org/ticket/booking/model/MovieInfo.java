package com.org.ticket.booking.model;

import lombok.Data;

@Data
public class MovieInfo {
	
	private String location;
	private String movieName;
	private String showTime; //morning or afternoon or evening or night or midnight;
	private String movieLaunguage;
	private String screenName;

}

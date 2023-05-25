package com.org.theatre.onboard.model;

import java.util.Date;

import lombok.Data;

@Data
public class SearchRequest {
	
	
	private String theatreName;
	private String location;
	private Date bookingDate;
	private String movieName;
	private String mobileNumber;
	private String showTime; //morning or afternoon or evening or night or midnight;
	private String movieLaunguage;
}

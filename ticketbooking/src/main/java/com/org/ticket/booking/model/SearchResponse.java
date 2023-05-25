package com.org.ticket.booking.model;

import java.util.List;

import lombok.Data;

@Data
public class SearchResponse {
	
	private String theatreName;
	private List<MovieInfo> movies;
	
}

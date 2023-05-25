package com.org.ticket.booking.service;

import com.org.ticket.booking.model.SearchRequest;
import com.org.ticket.booking.model.SearchResponse;

public interface SearchMovieService {
	
	
	public SearchResponse getMovieDetails(SearchRequest searchRequest );

}

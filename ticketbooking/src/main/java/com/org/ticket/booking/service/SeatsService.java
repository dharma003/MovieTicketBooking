package com.org.ticket.booking.service;

import java.util.List;
import java.util.Optional;

import com.org.ticket.booking.model.Seats;

public interface SeatsService {
	
	public String saveSeats(Seats seats);
	
	public List<Optional<Seats>> getSeatsDetails(String movieName);

}

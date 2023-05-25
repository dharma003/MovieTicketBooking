package com.org.ticket.booking.model;


import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;



@Document
@Data
public class Seats {
	private String theatreId;
	private String movieName;
	private Long seatsCount;
	private Long availableSeats;

}

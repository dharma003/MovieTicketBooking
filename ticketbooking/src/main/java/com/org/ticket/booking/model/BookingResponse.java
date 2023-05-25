package com.org.ticket.booking.model;

import lombok.Data;

@Data
public class BookingResponse {
	
	private String movieName;
	private String bookingStatus;
	private String bookingName;
	private String seats;
	private String movieTime;
	private String theatreName;
	private Long paymentAmount;
	private String paymentStatus;
	

}

package com.org.theatre.onboard.model;

import java.util.Date;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="tickethistory")
public class BookingTicketsHistory {
	
	private String bookingId;
	private String theatreName;
	private Map<String,String> seats;
	private String movieName;
	private Long paidAmount;
	private Long bookingSeatsCount;
	private boolean bulkTicket;
	private Date bookingDate;
	private String paymentsStatus;
	private String mobileNumber;
	private String userName;
	private String bookingStatus; //confirmed or cancelled or payment failure
	private String showTime; //morning or afternoon or evening or night or midnight
	private Date showDate; 

}

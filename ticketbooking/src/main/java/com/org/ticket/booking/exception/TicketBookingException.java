package com.org.ticket.booking.exception;

import lombok.ToString;

@ToString
public class TicketBookingException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5470274583413920914L;
	private String errorCode;
	private String errorDesc;
	public TicketBookingException(String errorCode, String errorDesc) {
		super();
		this.errorCode = errorCode;
		this.errorDesc = errorDesc;
	}
	

}

package com.org.ticket.booking.model;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class SampleJsonConverter {
	
	public static void main(String ...s) {
		
		
		double val = 250;
		
		System.out.println(val-val/100*20);
		
		var total = val -val/100*50;
		
	Seats seats = new Seats();
	
	
	seats.setSeatsCount(200L);
	seats.setAvailableSeats(100L);
	//seats.setTheatreId("1");
	seats.setMovieName("Inox");
		
	Map<String,Integer> map = new HashMap<>();
	
	map.put("seatNo", 1);
	
	//seats.setSeatNum(map);
	
	System.out.println(new Gson().toJson(seats));;
	
	}

}

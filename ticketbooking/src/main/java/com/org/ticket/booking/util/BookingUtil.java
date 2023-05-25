package com.org.ticket.booking.util;

import org.springframework.beans.factory.annotation.Value;

public class BookingUtil {
	
	@Value("${discount.percentage}")
	private String discountPercentage;
	
	
	
	// reduce amount 20 percentage for Afternoon booking tickets
	public Double getAmount(Double totalAmount) {
		
	
		var str1 = Double.parseDouble(discountPercentage);
		
		//if(discountPercentage.equals("20")) {
			
		totalAmount = totalAmount-totalAmount/100*str1;
			
	///	}
		
		
		return totalAmount;
		
	}

}

package com.org.ticket.booking.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name="movie")
@Entity
public class movies {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String movieName;
	private String launguage;
	private String theatureId;
	private String avilability;
	private Date startDate;
	private Date endDate;
	private String screenName;
	private String showTime;

}

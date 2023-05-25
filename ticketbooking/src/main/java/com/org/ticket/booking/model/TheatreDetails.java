package com.org.ticket.booking.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name="theatres")
@Entity
public class TheatreDetails {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String theatreName;
	private String city;
	private Long seatsCapacity;
	private Long firstClass;
	private Long secondClass;
	private Long deluxe;
	private Long screensCount;
	private String tenantName;
	
	  @OneToMany(cascade = CascadeType.ALL)
	  private List<movies> movieList;
	 

}

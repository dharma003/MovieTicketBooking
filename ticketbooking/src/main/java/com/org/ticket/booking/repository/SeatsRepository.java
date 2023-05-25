package com.org.ticket.booking.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.org.ticket.booking.model.Seats;

public interface SeatsRepository extends MongoRepository<Seats, String>{

	@Query("{ 'movieName' : ?0 }")
	public List<Seats> findByMovieName(String movieName);

}

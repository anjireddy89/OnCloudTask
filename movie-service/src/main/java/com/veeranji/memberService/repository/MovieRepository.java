package com.veeranji.memberService.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.veeranji.memberService.models.Movie;

@Repository
public interface MovieRepository extends MongoRepository<Movie, String> {

	/* List<Movie> findByisFavoriteTrue(); */
	
	List<Movie> findByMemberAndIsFavoriteTrue(String id);
	

}

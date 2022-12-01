package com.spring.data.jpa.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.data.jpa.demo.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{
	
	public Movie findByTitle(String title);

	Optional<Movie> findById(Long id);
	
	List<Movie> findAll();
	
	void deleteById(Long id);
	
}

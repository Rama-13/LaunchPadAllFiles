package com.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.dao.MovieDAO;
import com.movie.model.Movie;

@RestController
public class MovieController {
	
	@Autowired
	MovieDAO movieDAO;

	
	@RequestMapping("/getMovie")
	public Movie getMovie()
	{
		Movie movie = new Movie(1100,"Pan's Labyrinth","Guillermo Del Toro",1000);
		movieDAO.save(movie);
		return movie;
		
	}
}

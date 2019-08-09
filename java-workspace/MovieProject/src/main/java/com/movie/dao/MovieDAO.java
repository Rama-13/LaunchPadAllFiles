package com.movie.dao;

import org.springframework.data.repository.CrudRepository;

import com.movie.model.Movie;

public interface MovieDAO extends CrudRepository<Movie, Integer>{

}

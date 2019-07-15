package com.platzi.javatests.movies.data;

import java.util.Collection;

import com.platzi.javatests.movies.model.Movie;

public interface MovieRepository {
	
	Movie findById(long id);
    Collection<Movie> findAll();
    void saveOrUpdate(Movie movie);
    Collection<Movie> findByName(String name);

}

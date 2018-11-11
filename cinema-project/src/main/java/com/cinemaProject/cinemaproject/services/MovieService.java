package com.cinemaProject.cinemaproject.services;

import java.util.List;

import com.cinemaProject.cinemaproject.entities.Movie;

public interface MovieService {
	
	public List<Movie> listMovies();
	
	public Movie getMovieByName(String name);
	
	public Movie getMovieById(Long byId);
	
	public boolean addMovie(Movie movie,String location,String starting_hour,String ending_hour);
	
	public void removeMovie(Movie movie);
}

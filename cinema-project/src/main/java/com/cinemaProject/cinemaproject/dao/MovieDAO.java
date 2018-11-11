package com.cinemaProject.cinemaproject.dao;

import java.util.List;

import com.cinemaProject.cinemaproject.entities.Movie;

public interface MovieDAO {
	/**
	 * List all the movies from the db .
	 * 
	 * @return
	 */
	public List<Movie> getAllMovies();

	/**
	 * Get a movie by its id.
	 * 
	 * @param byId
	 * @return
	 */
	public Movie getMovieById(Long byId);

	/**
	 * Get movie by its name.
	 * 
	 * @param movie
	 */

	public List<Movie> getMovieByName(String name);

	/**
	 * Add a movie to the 'movies' table .
	 * 
	 * @param movie
	 */
	public void addMovie(Movie movie);

	/**
	 * Remove a movie from the 'movies' table.
	 * 
	 * @param movie
	 */
	public void removeMovie(Movie movie);

}

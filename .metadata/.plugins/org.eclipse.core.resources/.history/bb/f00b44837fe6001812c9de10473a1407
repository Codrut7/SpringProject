package com.cinemaProject.cinemaproject.services.implementationService;


import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cinemaProject.cinemaproject.dao.MovieDAO;
import com.cinemaProject.cinemaproject.entities.Movie;
import com.cinemaProject.cinemaproject.entities.ProgramDetails;
import com.cinemaProject.cinemaproject.services.MovieService;
import com.cinemaProject.cinemaproject.util.DateConverter;
/**
 * Movie service layer that implements the logic behind the DAO process.
 * @author cordu
 *
 */
public class MovieServiceJPA implements MovieService {

	@Autowired
	MovieDAO movieDAO;

	@Override
	public List<Movie> listMovies() {
		return movieDAO.getAllMovies();
	}

	@Override
	public Movie getMovieById(Long byId) {
		return movieDAO.getMovieById(byId);
	}
	/**
	 * We use the util method to verify if the provided @param starting_h and @param ending_h are valid.
	 * If those are valid, we create the ProgramDetails object and attach it to the movie entity and add it to the table.
	 * We return true if the TimeStamps are valid and the entity was inserted in the db. Else, false.
	 */
	@Override
	public boolean addMovie(Movie movie, String location, String starting_hour, String ending_hour) {
		Timestamp starting = DateConverter.convert(starting_hour);
		Timestamp ending = DateConverter.convert(ending_hour);
		if (starting != null && ending != null) {
			ProgramDetails programDetails = new ProgramDetails();
			programDetails.setLocation(location);
			programDetails.setStartingHour(starting);
			programDetails.setEndingHour(ending);
			movie.setProgramDetails(programDetails);
			movieDAO.addMovie(movie);
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Convert the list of Movie objects that have the specified @param into a single movie object . ( extract the head ).
	 */
	@Override
	public Movie getMovieByName(String username) {
		List<Movie> result = movieDAO.getMovieByName(username);
		if (result == null || result.size() == 0) {
			return null;
		} else {
			Movie movie = result.get(0);
			return movie;
		}
	}

	@Override
	public void removeMovie(Movie movie) {
		movieDAO.removeMovie(movie);
	}
}

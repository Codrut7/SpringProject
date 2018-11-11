package com.cinemaProject.cinemaproject.util;

import java.net.URI;
import java.util.List;

import javax.ws.rs.core.UriBuilder;

import com.cinemaProject.cinemaproject.entities.Client;
import com.cinemaProject.cinemaproject.entities.Movie;

public class UriBuilderUtil {

	public static URI ClientBuild(Client client, String jsp) {
		URI uri = UriBuilder.fromPath("http://localhost:8080/cinema-project/"+ jsp)
				.queryParam("id", client.getIdclients()).queryParam("moviesNumber", client.getMovies().size())
				.queryParam("name", client.getUserName()).queryParam("email", client.getEmail())
				.queryParam("cellphone", client.getPhoneNumber()).build();
		return uri;
	}

	public static URI MovieBuild(Client client, String jsp) {
		URI finalURI;
		int index = 0;
		UriBuilder uri = UriBuilder.fromPath("http://localhost:8080/cinema-project/" + jsp);
		uri.queryParam("id", client.getIdclients());
		uri.queryParam("moviesNumber", client.getMovies().size());
		for (Movie movie : client.getMovies()) {
			uri.queryParam("id" + index, movie.getId());
			uri.queryParam("name" + index, movie.getName());
			uri.queryParam("genre" + index, movie.getGenre());
			uri.queryParam("description" + index, movie.getDescription());
			uri.queryParam("image" + index, movie.getImageURL());
			uri.queryParam("location" + index, movie.getProgramDetails().getLocation());
			uri.queryParam("start_h" + index, movie.getProgramDetails().getStartingHour());
			uri.queryParam("end_h" + index, movie.getProgramDetails().getEndingHour());
			index++;
		}
		finalURI = uri.build();
		return finalURI;
	}
	
	/**
	 * URI builder for the SELECT * from movies ( all the existent movies, not the client ones )
	 * @param movieList
	 * @param id
	 * @return
	 */
	public static URI allMovies(List<Movie> allMovies,Long id, String jsp) {	
		UriBuilder uri = UriBuilder.fromPath("http://localhost:8080/cinema-project/" + jsp);
		uri.queryParam("id", id);
		uri.queryParam("moviesNumber", allMovies.size());
		int index = 0;
		for (Movie movie : allMovies) {
			uri.queryParam("id" + index, movie.getId());
			uri.queryParam("name" + index, movie.getName());
			uri.queryParam("description" + index, movie.getDescription());
			uri.queryParam("genre" + index, movie.getGenre());
			uri.queryParam("image" + index, movie.getImageURL());
			uri.queryParam("location" + index, movie.getProgramDetails().getLocation());
			uri.queryParam("start_h" + index, movie.getProgramDetails().getStartingHour());
			uri.queryParam("end_h" + index, movie.getProgramDetails().getEndingHour());
			index++;
		}
		URI finalUri = uri.build();
		return finalUri;	
	}

}

package com.cinemaproject.test.ServiceTest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;


import static org.hamcrest.CoreMatchers.is;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.cinemaProject.cinemaproject.dao.MovieDAO;
import com.cinemaProject.cinemaproject.entities.Movie;
import com.cinemaProject.cinemaproject.services.implementationService.MovieServiceJPA;

public class MovieServiceTest {
	@Mock
	private MovieDAO daoMock;
	@InjectMocks
	private MovieServiceJPA service;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testFindMovie() {
		when(daoMock.getMovieById(any(Long.class))).thenReturn(new Movie());
		Long x = (long) 124;
		Movie result = daoMock.getMovieById(x);
		assertNotNull(result);
	}
	/**
	 * We test the addMovie method that verifies if the starting hour input and the ending hour input from de admin are valid . (yyy-MM-dd hh:mm:ss.SSS)
	 */
	@Test
	public void testAddMovie() {
		Movie movie = new Movie();
		String location = "Room 2";
		String starting_h = "2018-12-25 18:50:25.000";
		String ending_h = "2018-12-25 20:50:25.000";
		assertThat(service.addMovie(movie, location, starting_h, ending_h), is(true));
		String location2 = "Room 13";
		String starting_h2 = "20122-2424-4.. 444";
		String ending_h2 = "$$$$$2012-12-12";
		assertThat(service.addMovie(movie, location2, starting_h2, ending_h2), is(false));
	}
	
	@Test
	public void testListMovies() {
		when(daoMock.getAllMovies()).thenReturn(new ArrayList<Movie>());
		System.out.println(service.listMovies());
		assertNotNull(service.listMovies());
	}
	
	@Test
	public void testFindByUsername() {
		Movie expectedResult = new Movie();
		expectedResult.setName("result");
		List<Movie> expectedResultList = new ArrayList<>();
		expectedResultList.add(expectedResult);
		when(daoMock.getMovieByName("result")).thenReturn(expectedResultList);
		Movie actualResult = service.getMovieByName("result");
		assertThat(actualResult.getName(), is(expectedResult.getName()));
	}
	
}

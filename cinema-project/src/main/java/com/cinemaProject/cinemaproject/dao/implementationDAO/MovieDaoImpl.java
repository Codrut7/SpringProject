package com.cinemaProject.cinemaproject.dao.implementationDAO;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.cinemaProject.cinemaproject.dao.MovieDAO;
import com.cinemaProject.cinemaproject.entities.Movie;
/**
 * The implementation of the MovieDAO methods using the entityManager provided .
 *
 * @author cordu
 */
@Transactional
public class MovieDaoImpl implements MovieDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Movie> getAllMovies() {
		return entityManager.createQuery("SELECT c FROM Movie c").setMaxResults(20).getResultList();
	}

	@Override
	public Movie getMovieById(Long byId) {
		return entityManager.find(Movie.class, byId);
	}

	@Override
	public void addMovie(Movie movie) {
		entityManager.persist(movie);
	}
	/**
	 * Custom query that selects a movie from the 'movies' table using the name column .
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Movie> getMovieByName(String name) {
		return entityManager.createQuery("SELECT c FROM Movie c WHERE c.name = :name").setParameter("name", name)
				.getResultList();
	}
	/**
	 * If the entity is attached to the entityManager remove it . Else, attach it and then remove it .
	 */
	@Override
	public void removeMovie(Movie movie) {
		if (entityManager.contains(movie)) {
			entityManager.remove(movie);
		} else {
			Movie ee = entityManager.getReference(movie.getClass(), movie.getId());
			entityManager.remove(ee);
		}
	}
}

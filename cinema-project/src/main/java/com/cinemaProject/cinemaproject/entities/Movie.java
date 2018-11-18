package com.cinemaProject.cinemaproject.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
/**
 * The movie entity mapped by hibernate with the SQL 'movies' table.
 * The id is auto-incremented.
 * There is a set of clients for each movie . ( many-many relationship ).
 * There is a one-one relationship with the program table . (mapped by the program table primary key (id))
 * @author cordu
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "movies")
public class Movie implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String genre;
	private String description;
	private String imageURL;
	@OneToOne(cascade = CascadeType.ALL)
	private ProgramDetails programDetails;
	@ManyToMany(mappedBy = "moviesList")
	private Set<Client> client = new HashSet<Client>();
	/**
	 * Default constructor and parameterized constructor .
	 */
	public Movie() {
		
	}
	
	public Movie(String name, String genre, String description, String imageURL) {
		this.name = name;
		this.genre = genre;
		this.description = description;
		this.imageURL = imageURL;
	}
	
	/**
	 * Getters and setters .
	 */
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public ProgramDetails getProgramDetails() {
		return programDetails;
	}

	public void setProgramDetails(ProgramDetails programDetails) {
		this.programDetails = programDetails;
	}
	
}

package com.cinemaProject.cinemaproject.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;
/**
 * The ProgrmaDetails entity mapped by hibernate with the SQL 'program' table.
 * The id is auto-incremented and has a foreign key constraint on the table 'movies' .
 * @author cordu
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "program")
public class ProgramDetails implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String location;
	@Column(name = "starting_hour")
	private Timestamp startingHour;
	@Column(name = "ending_hour")
	private Timestamp endingHour;
	/**
	 * Default constructor
	 */
	public ProgramDetails() {
		
	}
	/**
	 * Getters and setters.
	 */
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Timestamp getStartingHour() {
		return startingHour;
	}

	public void setStartingHour(Timestamp startingHour) {
		this.startingHour = startingHour;
	}

	public Timestamp getEndingHour() {
		return endingHour;
	}

	public void setEndingHour(Timestamp endingHour) {
		this.endingHour = endingHour;
	}

}

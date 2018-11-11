package com.cinemaProject.cinemaproject.dao;

import com.cinemaProject.cinemaproject.entities.Client;


import java.util.List;

/**
 * DAO class declares the Client rest methods.
 *
 * @author cordu
 */

public interface ClientDAO {

	/**
	 * Used to switch between jsp pages . We can get the logged user details using his id .
	 * @param byId
	 * @return
	 */
	public Client getClient(Long byId);

	/**
	 * Used by the client to create his account and update his movie list .
	 * 
	 * @param client
	 */
	public void updateClient(Client client);

	/**
	 * Used to login an existing account to our webservices . With a select query .
	 * @param user
	 * @param pass
	 * @return
	 */

	public List<Client> login(String user, String pass);

}
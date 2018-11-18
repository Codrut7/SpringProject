package com.cinemaProject.cinemaproject.services.implementationService;

import org.springframework.beans.factory.annotation.Autowired;
import com.cinemaProject.cinemaproject.dao.AdminDAO;
import com.cinemaProject.cinemaproject.entities.Client;
import com.cinemaProject.cinemaproject.services.AdminService;

public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDAO adminDAO;

	/**
	 * If there is any client with the @param, return it, else return null.
	 * 
	 * @param username
	 */
	@Override
	public Client findClientbyName(String username) {
		if (adminDAO.findClientbyUsername(username) == null || adminDAO.findClientbyUsername(username).size() == 0) {
			return null;
		} else {
			Client client = adminDAO.findClientbyUsername(username).get(0);
			return client;
		}
	}

	/**
	 * Delete the client .
	 */
	@Override
	public void removeClient(Client client) {
		adminDAO.removeClient(client);
	}
	
	/**
	 * Select query that imports a client from the db using his email address.
	 */
	@Override
	public Client findClientbyEmail(String email) {
		if (adminDAO.findClientbyEmail(email) == null || adminDAO.findClientbyEmail(email).size() == 0) {
			return null;
		} else {
			Client client = adminDAO.findClientbyEmail(email).get(0);
			return client;
		}
	}
}

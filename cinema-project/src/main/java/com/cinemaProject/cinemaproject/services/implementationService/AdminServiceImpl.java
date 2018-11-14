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

}

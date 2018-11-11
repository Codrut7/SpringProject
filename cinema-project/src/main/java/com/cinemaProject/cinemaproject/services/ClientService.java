package com.cinemaProject.cinemaproject.services;

import com.cinemaProject.cinemaproject.entities.Client;

public interface ClientService {
	public Client getClient(Long byId);
	
	boolean updateClient(Client client);

	Client loginClient(String user, String pass);

}

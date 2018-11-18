package com.cinemaProject.cinemaproject.services;

import com.cinemaProject.cinemaproject.entities.Client;

public interface AdminService {

	public Client findClientbyName(String username);

	public void removeClient(Client client);
	
	public Client findClientbyEmail(String email);

}

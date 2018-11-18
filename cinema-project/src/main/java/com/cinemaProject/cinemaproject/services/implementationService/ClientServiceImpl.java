package com.cinemaProject.cinemaproject.services.implementationService;

import com.cinemaProject.cinemaproject.dao.ClientDAO;

import com.cinemaProject.cinemaproject.entities.Client;
import com.cinemaProject.cinemaproject.services.ClientService;
import com.cinemaProject.cinemaproject.util.HashPassword;
import com.cinemaProject.cinemaproject.util.validators.ClientValidator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * The methods implementation layer. Used for validation and other business logic.
 *
 * @author cordu
 */
@Transactional
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDAO clientDAO;

	@Override
	public Client getClient(Long byId) {
		return clientDAO.getClient(byId);
	}

	/**
	 * Update a client on the db.
	 */
	@Override
	public boolean updateClient(Client client) {
		clientDAO.updateClient(client);
		return true;
	}

	/**
	 * Return null if there isn't any user with the given user/pass, else return the user.
	 */
	@Override
	public Client loginClient(String user, String pass) {
		List<Client> result = clientDAO.loginClient(user, pass);
		if (result == null || result.size() == 0) {
			return null;
		} else {
			Client client = result.get(0);
			return client;
		}
	}
	/**
	 * Verify the integrity of the fields . If the fields are valid, hash the clients password and persist the client into the db.
	 */
	@Override
	public boolean registerClient(Client client) throws NoSuchAlgorithmException {
		if (ClientValidator.UsernameValidator(client.getUserName()) && ClientValidator.EmailValidator(client.getEmail())
				&& ClientValidator.CellphoneValidator(client.getPhoneNumber())
				&& ClientValidator.PasswordValidator(client.getPassword())) {
			client.setPassword(HashPassword.HashPass(client.getPassword()));
			clientDAO.updateClient(client);
			return true;
		}
		return false;
	}

}

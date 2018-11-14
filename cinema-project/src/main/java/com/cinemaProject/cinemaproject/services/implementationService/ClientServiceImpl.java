package com.cinemaProject.cinemaproject.services.implementationService;

import com.cinemaProject.cinemaproject.dao.ClientDAO;

import com.cinemaProject.cinemaproject.entities.Client;
import com.cinemaProject.cinemaproject.services.ClientService;
import com.cinemaProject.cinemaproject.util.validators.ClientValidator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

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
	 * Validate each field given at the registry page using the ClientValidator class.
	 * Return true if all the client fields are valid. Else, return false.
	 */
	@Override
	public boolean updateClient(Client client) {
		if (ClientValidator.UsernameValidator(client.getUserName()) && ClientValidator.EmailValidator(client.getEmail())
				&& ClientValidator.CellphoneValidator(client.getPhoneNumber())
				&& ClientValidator.PasswordValidator(client.getPassword())) {
			clientDAO.updateClient(client);
			return true;
		}
		return false;
	}

	/**
	 * Return null if there isn't any user with the given user/pass, else return the user.
	 */
	@Override
	public Client loginClient(String user, String pass) {
		List<Client> result = clientDAO.login(user, pass);
		if (result == null || result.size() == 0) {
			return null;
		} else {
			Client client = result.get(0);
			return client;
		}
	}

}

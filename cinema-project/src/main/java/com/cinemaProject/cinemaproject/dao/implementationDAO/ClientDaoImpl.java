package com.cinemaProject.cinemaproject.dao.implementationDAO;
import com.cinemaProject.cinemaproject.dao.ClientDAO;

import com.cinemaProject.cinemaproject.entities.Client;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * The implementation of the Client DAO methods using the entityManager provided .
 *
 * @author cordu
 */
@Transactional
public class ClientDaoImpl implements ClientDAO {

	// load the entityManager from the persistence.xml
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Client getClient(Long byId) {
		return entityManager.find(Client.class, byId);
	}

	@Override
	public void updateClient(Client client) {
		entityManager.merge(client);
	}
	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Client> login(String user, String pass) {
		return entityManager
				.createQuery("SELECT c FROM Client c WHERE c.userName LIKE :userName AND c.password LIKE :clientPass")
				.setParameter("userName", user).setParameter("clientPass", pass).setMaxResults(1).getResultList();
	}
}
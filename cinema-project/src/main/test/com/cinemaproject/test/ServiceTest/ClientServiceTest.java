package com.cinemaproject.test.ServiceTest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.cinemaProject.cinemaproject.dao.ClientDAO;
import com.cinemaProject.cinemaproject.entities.Client;
import com.cinemaProject.cinemaproject.services.implementationService.ClientServiceImpl;

public class ClientServiceTest {

	@Mock
	private ClientDAO daoMock;
	@InjectMocks
	private ClientServiceImpl service;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testRegisterClient() {
		Client client = new Client();
		client.setUserName("Mihaitza");
		client.setPassword("sefubaniloR123!");
		client.setEmail("yomagnificu@gmail.com");
		client.setPhoneNumber("1234567890");
		assertThat(service.updateClient(client), is(true));
	}

	@Test
	public void testLoginClient() {
		// Create the expected client you want the db to generate from your input
		Client expectedClient = new Client();
		expectedClient.setUserName("Mihaitza");
		expectedClient.setPassword("sefubaniloR123!");
		List<Client> result = new ArrayList<>();
		result.add(expectedClient);
		// Tell the mock db what to do when he gets some input
		when(daoMock.loginClient("Mihaitza", "sefubaniloR123!")).thenReturn(result);
		// Insert the mock account
		Client actualResult = service.loginClient("Mihaitza", "sefubaniloR123!");
		assertThat(actualResult.getUserName(), is("Mihaitza"));
	}
	
	@Test
	public void testGetClient() {
		when(daoMock.getClient(any(Long.class))).thenReturn(new Client());
		Long x = (long) 124;
		Client result = daoMock.getClient(x);
		assertNotNull(result);
	}
	
}

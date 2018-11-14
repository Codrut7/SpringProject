package com.cinemaproject.test.ServiceTest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.cinemaProject.cinemaproject.dao.AdminDAO;
import com.cinemaProject.cinemaproject.entities.Client;
import com.cinemaProject.cinemaproject.services.implementationService.AdminServiceImpl;

public class AdminServiceTest {
	@Mock
	private AdminDAO daoMock;
	@InjectMocks
	private AdminServiceImpl service;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testFindClientByName() {
		Client expectedResult = new Client();
		expectedResult.setUserName("result");
		List<Client> expectedResultList = new ArrayList<>();
		expectedResultList.add(expectedResult);
		when(daoMock.findClientbyUsername("result")).thenReturn(expectedResultList);
		Client actualResult = service.findClientbyName("result");
		assertThat(actualResult.getUserName(), is(expectedResult.getUserName()));
	}
}

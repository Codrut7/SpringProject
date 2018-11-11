package com.cinemaProject.cinemaproject;

import com.cinemaProject.cinemaproject.rest.AdminRest;

import com.cinemaProject.cinemaproject.rest.ClientRest;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

public class MyApp extends ResourceConfig {
	public MyApp() {
		register(ClientRest.class);
		register(AdminRest.class);
		register(RequestContextFilter.class);
		register(JacksonFeature.class);
	}
}

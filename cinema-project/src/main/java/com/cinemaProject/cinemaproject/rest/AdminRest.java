package com.cinemaProject.cinemaproject.rest;

import java.net.URI;



import java.net.URISyntaxException;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.cinemaProject.cinemaproject.entities.Client;
import com.cinemaProject.cinemaproject.entities.Movie;
import com.cinemaProject.cinemaproject.services.AdminService;
import com.cinemaProject.cinemaproject.services.ClientService;
import com.cinemaProject.cinemaproject.services.MovieService;
import com.cinemaProject.cinemaproject.util.UriBuilderUtil;


@Path("/admin")
public class AdminRest {

	@Autowired
	private AdminService adminService;
	@Autowired
	private ClientService clientService;
	@Autowired
	private MovieService movieService;
	

	/**
	 * Find a client by its username and redirect to clientMovies.jsp to see the respective client movies.
	 * @param name
	 * @return
	 * @throws URISyntaxException
	 */
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_HTML)
	@Path("/findClient")
	public Response getClient(@FormParam("name") String name) throws URISyntaxException {
		Client result = adminService.findClientbyName(name);
		if (result==null) {
			URI redirect = new URI("http://localhost:8080/cinema-project/admin.jsp");
			return Response.seeOther(redirect).build();
		} else {
			URI uri = UriBuilderUtil.MovieBuild(result, "clientMovies.jsp");
			return Response.seeOther(uri).build();
		}
	}

	@GET
	@Path("/{byId}/clearMovies")
	public Response clearMovies(@PathParam("byId") Long byId) throws URISyntaxException {
		Client client = clientService.getClient(byId);
		client.clearMovies();
		clientService.updateClient(client);
		URI redirect = new URI("http://localhost:8080/cinema-project/admin.jsp");
		return Response.seeOther(redirect).build();
	}

	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_HTML)
	@Path("/deleteUser")
	public Response deleteUser(@FormParam("name") String name) throws URISyntaxException {
		Client result = adminService.findClientbyName(name);
		if (result==null) {
			URI redirect = new URI("http://localhost:8080/cinema-project/Error.jsp");
			return Response.seeOther(redirect).build();
		} else {
			adminService.removeClient(result);
			URI redirect = new URI("http://localhost:8080/cinema-project/admin.jsp");
			return Response.seeOther(redirect).build();
		}
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_HTML)
	@Path("/addMovie")
	public Response addMovie(@FormParam("name") String name, @FormParam("description") String description,@FormParam("genre")String genre,@FormParam("image_url")String image_url,@FormParam("location") String location,@FormParam("starting_hour") String starting_hour,@FormParam("ending_hour") String ending_hour) throws URISyntaxException {
		Movie movie = new Movie(name,genre,description,image_url);
		if(movieService.addMovie(movie, location, starting_hour, ending_hour)) {
			URI redirect = new URI("http://localhost:8080/cinema-project/admin.jsp");
			return Response.seeOther(redirect).build();
		}else {
			URI redirect = new URI("http://localhost:8080/cinema-project/Error.jsp");
			return Response.seeOther(redirect).build();
		}
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_HTML)
	@Path("/removeMovie")
	public Response removeMovie(@FormParam("movieName") String name) throws URISyntaxException {
		Movie movie = movieService.getMovieByName(name);
		if(movie!=null) {
			movieService.removeMovie(movie);
			URI redirect = new URI("http://localhost:8080/cinema-project/admin.jsp");
			return Response.seeOther(redirect).build();
		}else {
			URI redirect = new URI("http://localhost:8080/cinema-project/Error.jsp");
			return Response.seeOther(redirect).build();
		}
	}
}

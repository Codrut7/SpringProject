package com.cinemaProject.cinemaproject.rest;

import com.cinemaProject.cinemaproject.entities.Client;

import com.cinemaProject.cinemaproject.entities.Movie;
import com.cinemaProject.cinemaproject.services.ClientService;
import com.cinemaProject.cinemaproject.services.MovieService;
import com.cinemaProject.cinemaproject.util.UriBuilderUtil;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.io.FileNotFoundException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/**
 * REST MAPPING FOR THE CLIENT.
 *
 * @author cordu
 */
@Path("/client")
public class ClientRest {

	@Autowired
	ClientService clientService;
	@Autowired
	MovieService movieService;
	
	/**
	 * 1) First take the 5 param from the html forms ( username, password, password-repeat,cellphone, email adress )
	 * 2) Create a new Client object using the parameters and we set his role to default (USER)
	 * 3) Validate the client credentials .
	 * 4) Attach the client to the entityManager and we merge it after that .
	 * 5) Redirect the user to the login page . 
	 * @param name
	 * @param phoneNumber
	 * @param email
	 * @param password
	 * @param passwordConfirmation
	 * @return
	 * @throws URISyntaxException
	 * @throws FileNotFoundException
	 */
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_HTML)
	@Path("/save")
	public Response saveClient(@FormParam("name") String name, @FormParam("phone") String phoneNumber,
			@FormParam("email") String email, @FormParam("psw") String password) throws URISyntaxException, FileNotFoundException {
		Client client = new Client(name,email,phoneNumber,password);
		//3
		if(clientService.updateClient(client)) {
			URI uri = new URI("http://localhost:8080/cinema-project/faces/login.html");
			return Response.seeOther(uri).build();
		}else {
			URI uri = new URI("http://localhost:8080/cinema-project/faces/registerError.jsp");
			return Response.seeOther(uri).build();
		}
	}
	/**
	 * !!! E imposibil ca unul dintre id-uri sa fie invalid . id-ul clientului e pasat dupa login. id-ul filmului e mereu valid ( altfel nu ar aparea butonul)
	 * 
	 * 
	 * 1) Check if the client with the username and password from the users input exists ( using hibernate query ) . Redirec to login page if not
	 * 2) If it exists, check if he has the role of ADMIN or USER .
	 * 3) If ADMIN -> redirect to admin.jsp . Else, redirect use an util function to build the home.jsp with the query params
	 * @param name
	 * @param password
	 * @return
	 * @throws URISyntaxException
	 */
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_HTML)
	@Path("/login")
	public Response loginRedirect(@FormParam("name") String name, @FormParam("password") String password)
			throws URISyntaxException {
		Client loggedClient = clientService.loginClient(name, password);
		//1
		if (loggedClient==null) {
			URI uri = new URI("http://localhost:8080/cinema-project/faces/login.html");
			return Response.seeOther(uri).build();
		} else {
			//2,3
			if (loggedClient.getRole().equals("ADMIN")) {
				URI uri = UriBuilder.fromPath("http://localhost:8080/cinema-project/admin.jsp").build();
				return Response.seeOther(uri).build();
			} else {
				return Response.seeOther(UriBuilderUtil.ClientBuild(loggedClient, "home.jsp")).build();
			}
		}
	}
	/**
	 * We find a client by his id ( primary key ) in order to list his movies as query param to the website.
	 * @param byId
	 * @return
	 * @throws URISyntaxException
	 */
	@GET
	@Path("/{id}/myMovies")
	public Response listClientMovies(@PathParam("id") Long byId) throws URISyntaxException {
		Client client = clientService.getClient(byId);
		URI redirect = UriBuilderUtil.MovieBuild(client, "myMovies.jsp");
		return Response.seeOther(redirect).build();
	}
	
	/**
	 * Used to redirect to the home.jsp where we need the client query params .
	 * @param byId
	 * @return
	 * @throws URISyntaxException
	 */
	@GET
	@Path("/{id}/getClient")
	public Response getClient(@PathParam("id") Long byId) throws URISyntaxException {
		Client client = clientService.getClient(byId);
		URI uri = UriBuilderUtil.ClientBuild(client, "home.jsp");
		return Response.seeOther(uri).build();
	}
	/**
	 * Use to redirect to allMovies.jsp where we have a list of all the available movies . We use the client id to remember who is logged in
	 * @param id
	 * @return
	 */
	@GET
	@Path("/{id}/allMovies")
	public Response listAllMovies(@PathParam("id") Long id) {
		List<Movie> allMovies = movieService.listMovies();
		URI finalURI = UriBuilderUtil.allMovies(allMovies, id, "allMovies.jsp");
		return Response.seeOther(finalURI).build();
	}
	/**
	 * We add the movie with the idMovie on the client list and then we save the client (merge) to the db.
	 * We also redirect the client to the allMovies.jsp page.
	 * 
	 * @param idClient
	 * @param idMovie
	 * @return
	 */
	@GET
	@Path("/{idClient}/{idMovie}/addMovie")
	public Response addMovie(@PathParam("idClient") Long idClient, @PathParam("idMovie") Long idMovie) {
		Client client = clientService.getClient(idClient);
		Movie movie = movieService.getMovieById(idMovie);
		if(!client.contains(movie)) {
			client.addMovie(movie);
			clientService.updateClient(client);
		}
		List<Movie> allMovies = movieService.listMovies();
		URI finalURI = UriBuilderUtil.allMovies(allMovies, idClient, "allMovies.jsp");
		return Response.seeOther(finalURI).build();
	}
	/**
	 * Finds the client with the @param idClient and the movie with the @param idMovie from db.
	 * Removes the movie from the client list . We save the changes and redirect the client to allMovies.jsp.  
	 * @param idClient
	 * @param idMovie
	 * @return
	 */
	@GET
	@Path("/{idClient}/{idMovie}/removeMovie")
	public Response removeMovie(@PathParam("idClient") Long idClient, @PathParam("idMovie") Long idMovie) {
		Client client = clientService.getClient(idClient);
		Movie movie = movieService.getMovieById(idMovie);
		client.removeMovie(movie);
		clientService.updateClient(client);
		List<Movie> allMovies = movieService.listMovies();
		URI finalURI = UriBuilderUtil.allMovies(allMovies, idClient, "allMovies.jsp");
		return Response.seeOther(finalURI).build();
	}
}

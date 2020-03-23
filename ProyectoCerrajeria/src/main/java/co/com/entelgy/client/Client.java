package co.com.entelgy.client;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.camel.Body;

import co.com.entelgy.model.RequestRest;
/**
 * 
 * 
 *
 */
@Path("/")
public interface Client {

	@GET
	@Path("/consultarPersonas")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void consultarPersonas();
	
	@GET
	@Path("/nombreProyecto")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void nombreProyecto();
	
	@GET
	@Path("/consultarPersona")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void consultarPersona();
	

	@POST
	@Path("/insertarPersona")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertarPersona(@Body RequestRest body);
	
	
}
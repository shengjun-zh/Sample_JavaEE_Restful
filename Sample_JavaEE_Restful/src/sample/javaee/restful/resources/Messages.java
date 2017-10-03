package sample.javaee.restful.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import sample.javaee.restful.dababase.MessagesDB;
import sample.javaee.restful.models.Message;

@Path("/Messages")
public class Messages extends Application {

	@POST
	@Path("/addMessage")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	// http://localhost:8080/Sample_JavaEE_Restful/resources/RestServiceJson/getMessage
	public Message addMessage(Message msg) {
		MessagesDB.addMessages(msg);
		return msg;

	}
}

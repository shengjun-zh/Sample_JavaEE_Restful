package sample.javaee.restful.resources;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
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
	// http://localhost:8080/Sample_JavaEE_Restful/resources/Messages/addMessage
	public Message addMessage(Message msg) {
		MessagesDB.addMessages(msg);
		return msg;

	}
        
        @GET
	@Path("/getMessages")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	// http://localhost:8080/Sample_JavaEE_Restful/resources/Messages/getMessages
	public List<Message> getMessages() {
		return MessagesDB.getMessages();

	}
}

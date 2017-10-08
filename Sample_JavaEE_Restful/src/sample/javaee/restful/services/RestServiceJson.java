package sample.javaee.restful.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import sample.javaee.restful.models.Message;
 
@ApplicationPath("/resources")
@Path("/RestServiceJson")
public class RestServiceJson extends Application {

	@GET
	@Path("/getMessage")
	@Produces(MediaType.APPLICATION_JSON)
	// http://localhost:8080/Sample_JavaEE_Restful/resources/RestServiceJson/getMessage
	public List<Message> getMsg() {

		List<Message> list = new ArrayList<Message>();
//		list.add(new Message(1L, "Hello World!"));
//		list.add(new Message(2L, "Hello Jersey!"));

		return list;
	}
}

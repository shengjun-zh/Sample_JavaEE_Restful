package sample.javaee.restful.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import sample.javaee.restful.models.MessageXml;

@ApplicationPath("/resources")
@Path("/RestServiceXml")
public class RestServiceXml extends Application {

	@GET
	@Path("/getMessage")
	@Produces(MediaType.APPLICATION_XML)
	// http://localhost:8080/Sample_JavaEE_Restful/resources/RestServiceXml/getMessage
	public List<MessageXml> getMsg() {

		List<MessageXml> list = new ArrayList<MessageXml>();
		list.add(new MessageXml(1L, "Hello World!"));
		list.add(new MessageXml(2L, "Hello Jersey!"));

		return list;
	}
}

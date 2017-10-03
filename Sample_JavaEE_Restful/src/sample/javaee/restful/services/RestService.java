package sample.javaee.restful.services;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

@ApplicationPath("/resources")
@Path("/MyRestService")
public class RestService extends Application {

	@GET
	@Path("/sayHello")
	// http://localhost:8080/Sample_JavaEE_Restful/resources/MyRestService/sayHello
	public String getHelloMsg() {
		return "Hello World!";
	}

	@GET
	@Path("/echo")
	// http://localhost:8080/Sample_JavaEE_Restful/resources/MyRestService/echo?message=a
	public Response getEchoMsg(@QueryParam("message") String msg) {
		return Response.ok("Your msg was: " + msg).build();

	}
}

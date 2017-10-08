package sample.javaee.restful.resources;

import java.util.List;
import javax.ws.rs.BeanParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Application;
import sample.javaee.restful.models.Message;
import sample.javaee.restful.resources.beans.MessageFilterBean;
import sample.javaee.restful.services.MessageService;

@Path("/Messages")
public class MessageResource extends Application {

//	@POST
//	@Path("/addMessage")
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
//	// http://localhost:8080/Sample_JavaEE_Restful/resources/Messages/addMessage
//	public Message addMessage(Message msg) {
//		DatabaseClass.addMessage(msg);
//		return msg;
//
//	}
//        
//        @GET
//	@Path("/getMessages")
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
//	// http://localhost:8080/Sample_JavaEE_Restful/resources/Messages/getMessages
//	public List<Message> getMessages() {
//		return DatabaseClass.getMessages();
//	}
    MessageService messageService = new MessageService();

    @GET
    public List<Message> getMessages(@BeanParam MessageFilterBean filterBean) {
        if (filterBean.getYear() > 0) {
            return messageService.getAllMessagesForYear(filterBean.getYear());
        }
        if (filterBean.getStart() >= 0 && filterBean.getSize() > 0) {
            return messageService.getAllMessagesPaginated(filterBean.getStart(), filterBean.getSize());
        }
        return messageService.getAllMessages();
    }

    @POST
    public Message addMessage(Message message) {
        return messageService.addMessage(message);
    }

    @PUT
    @Path("/{messageId}")
    public Message updateMessage(@PathParam("messageId") long id, Message message) {
        message.setId(id);
        return messageService.updateMessage(message);
    }

    @DELETE
    @Path("/{messageId}")
    public void deleteMessage(@PathParam("messageId") long id) {
        messageService.removeMessage(id);
    }

    @GET
    @Path("/{messageId}")
    public Message getMessage(@PathParam("messageId") long id) {
        return messageService.getMessage(id);
    }
}

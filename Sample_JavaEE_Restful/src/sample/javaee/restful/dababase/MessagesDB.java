package sample.javaee.restful.dababase;

import java.util.ArrayList;
import java.util.List;

import sample.javaee.restful.models.Message;

public class MessagesDB {

	private static List<Message> list = new ArrayList<Message>();

	static {
		list.add(new Message(1L, "Hello World!"));
		list.add(new Message(2L, "Hello Jersey!"));
	}

	public static List<Message> getMessages() {
		return list;
	}
	public static List<Message> addMessages(Message msg) {
		list.add(msg);
		return list;
	}
}

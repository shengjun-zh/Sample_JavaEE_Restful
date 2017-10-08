package sample.javaee.restful.dababase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sample.javaee.restful.models.Message;

public class DatabaseClass {

	private static Map<Long, Message> messages = new HashMap<>();
//	private static Map<String, Profile> profiles = new HashMap<>();

	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	
//	public static Map<String, Profile> getProfiles() {
//		return profiles;
//	}
}

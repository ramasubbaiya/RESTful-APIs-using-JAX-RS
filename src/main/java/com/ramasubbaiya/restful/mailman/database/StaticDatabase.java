package com.ramasubbaiya.restful.mailman.database;

import java.util.HashMap;
import java.util.Map;

import com.ramasubbaiya.restful.mailman.model.Message;


public class StaticDatabase {
	
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Message> profiles = new HashMap<>();
	
	public static Map<Long, Message> getMessages() {
		messages.put(1L, new Message(1, "Message 1 ", "Rama"));
		messages.put(2L, new Message(2, "Message 2 ", "Rama"));
		messages.put(3L, new Message(3, "Message 3 ", "Rama"));
		return messages;
	}
	
	public static Map<Long, Message> getProfiles() {
		return profiles;
	}

}

package com.ramasubbaiya.restful.mailman.database;

import java.util.HashMap;
import java.util.Map;

import com.ramasubbaiya.restful.mailman.model.Message;
import com.ramasubbaiya.restful.mailman.model.Profile;


public class StaticDatabase {
	
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();
	
	static {
		messages.put(1L, new Message(1, "Message 1 ", "Rama"));
		messages.put(2L, new Message(2, "Message 2 ", "Rama"));
		messages.put(3L, new Message(3, "Message 3 ", "Rama"));
	}
	
	static {
		profiles.put("Aa", new Profile(1, "Aa", "Message 1 ", "Rama"));
		profiles.put("Bb", new Profile(2, "Bb", "Message 2 ", "Rama"));
		profiles.put("Cc", new Profile(3, "Cc", "Message 3 ", "Rama"));
	}
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	
	public static Map<String, Profile> getProfiles() {
		return profiles;
	}

}

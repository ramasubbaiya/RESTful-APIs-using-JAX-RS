package com.ramasubbaiya.restful.mailman.database;

import java.util.HashMap;
import java.util.Map;

import com.ramasubbaiya.restful.mailman.model.Message;


public class StaticDatabase {
	
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Message> profiles = new HashMap<>();
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	
	public static Map<Long, Message> getProfiles() {
		return profiles;
	}

}

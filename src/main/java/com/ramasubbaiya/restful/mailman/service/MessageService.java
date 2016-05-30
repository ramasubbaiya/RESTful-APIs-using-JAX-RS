package com.ramasubbaiya.restful.mailman.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ramasubbaiya.restful.mailman.database.StaticDatabase;
import com.ramasubbaiya.restful.mailman.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages = StaticDatabase.getMessages();
	
	public MessageService() {
		
	}
	
	//Get All Messages
	public List<Message> getAllMessages() { 
		return new ArrayList<Message>(messages.values());
	}
	
	//Get a Message
	public Message getMessage(long id) {
		return messages.get(id);
	}
	
	//Add a Message
	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}
	
	//Update a Message
	public Message updateMessage(Message message) {
		if(message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	//Remove a Message
	public Message removeMessage(long id) {
		return messages.remove(id);
	}
}

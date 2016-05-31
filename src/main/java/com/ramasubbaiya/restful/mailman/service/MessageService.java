package com.ramasubbaiya.restful.mailman.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import com.ramasubbaiya.restful.mailman.database.StaticDatabase;
import com.ramasubbaiya.restful.mailman.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages = StaticDatabase.getMessages();
	
	//Get All Messages
	public List<Message> getAllMessages() { 
		return new ArrayList<Message>(messages.values());
	}
	
	//Filter based on year
	public List<Message> getAllMessagesForYear(int year) {
		ArrayList<Message> messagesForYear = new ArrayList<>();
		Calendar cal = Calendar.getInstance();
		//Loop into messages to get the YEAR equal to users filtered Year and add them to new Array 
		for(Message message: messages.values()) {
			cal.setTime(message.getCreated());
			if(cal.get(Calendar.YEAR) == year) 
				messagesForYear.add(message);
		}
		return messagesForYear;
	}
	
	//Pagination based on start and size value
	public List<Message> getAllMessagesPaginated(int start, int size) {
		ArrayList<Message> list = new ArrayList<Message>();
		//if the size of the entered value goes beyond the list size return a empty Array
		if((start + size) > list.size()) return new ArrayList<Message>();
		//Returns a list between fromIndex and toIndex
		return list.subList(start, start + size);
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

package com.ramasubbaiya.restful.mailman.service;

import java.util.ArrayList;
import java.util.List;

import com.ramasubbaiya.restful.mailman.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages() {
		Message m1 = new Message(1L, "Hello Message 1", "Rama");
		Message m2 = new Message(2L, "Hello Message 2", "Rama");
		Message m3 = new Message(3L, "Hello Message 3", "Rama");
		List<Message> m = new ArrayList<>();
		m.add(m1);
		m.add(m2);
		m.add(m3);
		return m;
	}
}

package com.ramasubbaiya.restful.mailman.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ramasubbaiya.restful.mailman.model.Message;
import com.ramasubbaiya.restful.mailman.service.MessageService;;

@Path("/messages")
public class MessagesResource {
	
	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}
}

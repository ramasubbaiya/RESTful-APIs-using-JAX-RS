package com.ramasubbaiya.restful.mailman.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/messages")
public class MessagesResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessages() {
		return "Hello World";
	}
}

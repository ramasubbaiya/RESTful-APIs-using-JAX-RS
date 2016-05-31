#RESTful API using JAX-RS

* GET
* POST
* PUT
* DELETE

* Returning XML and JSON formats
* Pagination and Filtering
* Using Context and Bean Param Annotaions
* Implementing Subresources
* Sending Status codes and Location headers


	```@POST
	public Message addMessage(Message message) {
		return messageService.addMessage(message);
	}
	```
	
	```@POST
	public Response addMessage(Message message) {
		Message newMessage = messageService.addMessage(message);
		return Response.status(Status.CREATED)
					   .entity(newMessage)
					   .build();
	}
	```
	
	```@POST
	public Response addMessage(Message message, @Context UriInfo uriInfo) {
		Message newMessage = messageService.addMessage(message);
		String newId = String.valueOf(newMessage.getId());
		URI uri = uriInfo.getAbsolutePathBuilder().path(newId).build();
		return Response.created(uri)
					   .entity(newMessage)
					   .build();
	}
	```
	
* Handling Exception and using WebApplication Exception
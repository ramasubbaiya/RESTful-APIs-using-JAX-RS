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


	* Without Response

	```
	@POST
	public Message addMessage(Message message) {
		return messageService.addMessage(message);
	}
	```
	* Response with StatusCode
	
	```
	@POST
	public Response addMessage(Message message) {
		Message newMessage = messageService.addMessage(message);
		return Response.status(Status.CREATED)
					   .entity(newMessage)
					   .build();
	}
	```
	* Response with Location
	
	```
	@POST
	public Response addMessage(Message message, @Context UriInfo uriInfo) {
		Message newMessage = messageService.addMessage(message);
		String newId = String.valueOf(newMessage.getId());
		URI uri = uriInfo.getAbsolutePathBuilder().path(newId).build();
		return Response.created(uri)
					   .entity(newMessage)
					   .build();
	}
	```
	
* Handling Exception

* Content Negotiation

	* Produce or Consume - Content Type of a desired type(Eg: XML or JSON or Plain Text)

	* For making it for all the Resource

	```@Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.TEXT_PLAIN})```

	```@Consumes(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.TEXT_PLAIN})```

	* For making it for desired Resource

	* The can specify which Content-Type they want in the Header(Either XML or JSON)


	```
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public list<Message> getAllMessagesInXML() {
		return messageService.getAllMessages();
	}
	```
	
 
	```
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public list<Message> getAllMessagesInJSON() {
		return messageService.getAllMessages();
	}
	```
	
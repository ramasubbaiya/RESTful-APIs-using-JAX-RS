package com.ramasubbaiya.restful.mailman.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.ramasubbaiya.restful.mailman.model.ErrorMessage;

//Registers in JAX-RS - so it knows that to map
@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

	@Override
	public Response toResponse(DataNotFoundException e) {
		ErrorMessage errorMessage = new ErrorMessage(e.getMessage(), 404, "www.github.com/ramasubbaiya");
		return Response.status(Status.NOT_FOUND)
					   .entity(errorMessage)
					   .build();
	}
	

}

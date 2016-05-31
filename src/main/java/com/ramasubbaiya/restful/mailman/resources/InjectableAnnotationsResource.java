package com.ramasubbaiya.restful.mailman.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/injectParamDemo")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class InjectableAnnotationsResource {
	
	@GET
	@Path("/annotations")
	public String getAnnotaions(@MatrixParam("param") String matrixParam, 
								@HeaderParam("userHeaderParam") String headerParam,
								@CookieParam("cookieName") String cookieParam) {
		
		//Matrix Param - Separate
		//Header Param - Gets the content of the Header
		//Cookie Param - Gets the cookie parameters
		
		//You might get an error if cookie is not enabled
		if(cookieParam.isEmpty()) 
			cookieParam = "Enable Cookie";
		
		return "Matrix Param " + matrixParam + 
				"\nHeader Param " + headerParam + 
				"\nCookie Param " + cookieParam;
	}
	
	
}

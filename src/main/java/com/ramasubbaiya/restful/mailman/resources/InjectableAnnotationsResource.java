package com.ramasubbaiya.restful.mailman.resources;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import com.ramasubbaiya.restful.mailman.resources.beans.FilterByBeanParam;

@Path("/injectParamDemo")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class InjectableAnnotationsResource {
	
	@GET
	@Path("/annotations")
	public String getAnnotaions(@BeanParam FilterByBeanParam filterByBeanParam) {
		
		//Matrix Param - Separate
		//Header Param - Gets the content of the Header
		//Cookie Param - Gets the cookie parameters
		
		//You might get an error if cookie is not enabled
		if(filterByBeanParam.getCookieParam().isEmpty()) 
			filterByBeanParam.setCookieParam("Enable Cookie first!");
		
		return "Matrix Param " + filterByBeanParam.getMatrixParam() + 
				"\nHeader Param " + filterByBeanParam.getHeaderParam() + 
				"\nCookie Param " + filterByBeanParam.getCookieParam();
	}
	
	@GET
	@Path("/context")
	public String getParamsUsingContext(@Context UriInfo uriInfo, @Context HttpHeaders headers) {
		String uriPath = uriInfo.getAbsolutePath().toString();
		String header = headers.getRequestHeaders().toString();
		return "Path : " + uriPath + "\nHeaders : " + header;
	}
	
	
	
}

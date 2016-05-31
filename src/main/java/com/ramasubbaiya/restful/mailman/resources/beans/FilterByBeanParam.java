package com.ramasubbaiya.restful.mailman.resources.beans;

import javax.ws.rs.CookieParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;

public class FilterByBeanParam {

	private @MatrixParam("param") String matrixParam;
	private @HeaderParam("userHeaderParam") String headerParam;
	private @CookieParam("cookieName") String cookieParam;
	
	public String getMatrixParam() {
		return matrixParam;
	}
	public void setMatrixParam(String matrixParam) {
		this.matrixParam = matrixParam;
	}
	public String getHeaderParam() {
		return headerParam;
	}
	public void setHeaderParam(String headerParam) {
		this.headerParam = headerParam;
	}
	public String getCookieParam() {
		return cookieParam;
	}
	public void setCookieParam(String cookieParam) {
		this.cookieParam = cookieParam;
	}
	
	
	
}

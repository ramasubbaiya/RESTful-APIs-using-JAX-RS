package com.ramasubbaiya.restful.mailman.model;

import javax.xml.bind.annotation.XmlRootElement;

//To Produce/Convert to a XML or JSON response
@XmlRootElement
public class ErrorMessage {

	private String errorMessage;
	private int errorCode;
	private String documentaion;
	
	public ErrorMessage() {
		
	}
	
	public ErrorMessage(String errorMessage, int errorCode, String documentaion) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
		this.documentaion = documentaion;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getDocumentaion() {
		return documentaion;
	}
	public void setDocumentaion(String documentaion) {
		this.documentaion = documentaion;
	}
	
}

package com.learning;

public class UserValidationException extends Exception {
	enum ExceptionType{
		ENTERED_NULL, ENTERED_EMPTY, INVALID_FIRSTNAME, INVALID_LASTNAME, INVALID_MOBNUMBER, INVALID_EMAIL, INVALID_PASSWORD
	}
	ExceptionType exceptionType;
	public UserValidationException(ExceptionType exceptionType, String message) {
		super(message);
		this.exceptionType=exceptionType;
		// TODO Auto-generated constructor stub
	}
	
}

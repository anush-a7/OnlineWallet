package com.capgemini.epayment.exception;

public class InValidPasswordException extends RuntimeException {
	public InValidPasswordException(String exception) {
		System.err.println(exception);
		
	}

}

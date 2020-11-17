package com.revature.exceptions;


public class InvalidInputException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1754459409183796777L;

	public InvalidInputException(String errorMessage) {
	super(errorMessage);
}

}

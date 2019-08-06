package com.greatlearning.fsd.module4.exceptions;

public class InvalidAmountException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public  InvalidAmountException(String s) {
		/* Call the constructor of parent Exception */
		super(s);
	}

}
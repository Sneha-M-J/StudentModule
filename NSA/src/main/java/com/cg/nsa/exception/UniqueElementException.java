package com.cg.nsa.exception;

public class UniqueElementException extends RuntimeException{

	/***********************************
	 * 
	 * Non Parameterized Constructor
	 * 
	 **********************************/
	public UniqueElementException() {
		
	}
	
	/********************************************
	 * 
	 * Parameterized Constructor
	 * @param messages
	 *
	 ********************************************/
	public UniqueElementException(String message)
	{
		super(message);
	}
}
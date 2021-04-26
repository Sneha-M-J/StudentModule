package com.cg.nsa.exception;

/*****************************************************************************************
 * 
 * @author Sneha.M.J
 * Version 1.0
 * Description This is Custom UniqueElementException which extends the RuntimeException.
 * Created date: 21-04-2021
 * 
 *****************************************************************************************/

public class UniqueElementException extends RuntimeException
{

	/****************************************
	 * 
	 * Non Parameterized Constructor
	 * 
	 ****************************************/
	public UniqueElementException() 
	{
		
	}	
	
	
	/****************************************
	 * 
	 * Parameterized Constructor
	 * @param message
	 *
	 ****************************************/
	public UniqueElementException(String message)
	{
		super(message);
	}
	
}
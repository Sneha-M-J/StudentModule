package com.cg.nsa.exception;

import java.util.ArrayList;
import java.util.List;

/******************************************************************************************
 * 
 * @author Sneha.M.J
 * Version 1.0
 * Description This is Custom ValidationException which extends the RuntimeException.
 * Created date: 23-04-2021
 * 
 ******************************************************************************************/

public class ValidationException extends RuntimeException
{
	List<String> messages=new ArrayList<>();
	
	/*******************************************
	 * 
	 * Non Parameterized Constructor
	 *
	 *******************************************/
	public ValidationException()
	{
		
	}
	
	
	/********************************************
	 * 
	 * Parameterized Constructor
	 * @param messages
	 *
	 ********************************************/
	public ValidationException(List<String> messages) 
	{
		super();
		this.messages = messages;
	}

	
	/*********************************************************
	 * 
	 * @return - this method returns a list of messages.
	 *
	 *********************************************************/
	public List<String> getMessages() 
	{
		return messages;
	}
	

}

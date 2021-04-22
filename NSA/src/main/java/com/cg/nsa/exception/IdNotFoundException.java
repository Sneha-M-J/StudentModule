package com.cg.nsa.exception;
/**
 * 
 * @author Sneha.M.J
 * Version 1.0
 * Description This is Custom IdNotFOundException
 * Created date: 20-04-2021
 */
public class IdNotFoundException extends RuntimeException
{
	public IdNotFoundException()
	{
		
	}
	public IdNotFoundException(String msg)
	{
		super(msg);
	}
}

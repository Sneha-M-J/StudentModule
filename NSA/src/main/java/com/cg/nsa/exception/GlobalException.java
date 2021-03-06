package com.cg.nsa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**********************************************************************
 * 
 * @author Sneha.M.J
 * Version 1.0
 * Description This is GlobalException class.
 * Created date: 21-04-2021
 * 
 *********************************************************************/

@RestControllerAdvice
public class GlobalException 
{
	
	/*****************************************************
	 * 
	 * Handles IdNotFoundException
	 * @param exception
	 * @return - error messages
	 *
	 ****************************************************/
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<Object> handleException(IdNotFoundException exception)
	{
		return new ResponseEntity<>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	
	
	/*****************************************************
	 * 
	 * Handles ValidationException
	 * @param exception
	 * @return - error messages
	 * 
	*****************************************************/
	@ExceptionHandler(ValidationException.class)
	public ResponseEntity<Object> handleException(ValidationException exception)
	{
		return new ResponseEntity<>(exception.getMessages(),HttpStatus.NOT_FOUND);
	}
	
	
	
	/*****************************************************
	 * 
	 * Handles InvalidInstitutionException
	 * @param exception
	 * @return - error messages
	 *
	 *****************************************************/
	@ExceptionHandler(InvalidInstitutionException.class)
	public ResponseEntity<Object> handleException(InvalidInstitutionException exception)
	{
		return new ResponseEntity<>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	
	
	/*****************************************************
	 * 
	 * Handles UniqueElementException
	 * @param exception
	 * @return - error messages
	 *
	 *****************************************************/
	@ExceptionHandler(UniqueElementException.class)
	public ResponseEntity<Object> handleException(UniqueElementException exception)
	{
		return new ResponseEntity<>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}
}

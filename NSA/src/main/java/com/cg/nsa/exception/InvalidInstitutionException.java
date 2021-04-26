package com.cg.nsa.exception;

/************************************************************************************************
 * 
 * @author Sneha.M.J
 * Version 1.0
 * Description This is Custom InvalidInstitutionException which extends the RuntimeException.
 * Created date: 21-04-2021
 * 
 ***********************************************************************************************/
public class InvalidInstitutionException extends RuntimeException 
{

	public InvalidInstitutionException() {
		
	}

	public InvalidInstitutionException(String message) {
		super(message);
	}

	public InvalidInstitutionException(Throwable cause) {
		super(cause);
	}

	public InvalidInstitutionException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidInstitutionException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

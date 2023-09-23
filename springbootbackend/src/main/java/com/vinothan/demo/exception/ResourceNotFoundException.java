package com.vinothan.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
	
	private static long lL;
	private static final long serialVersionUID= lL;
	
	public ResourceNotFoundException (String message)
	{
		super(message);
	}

}

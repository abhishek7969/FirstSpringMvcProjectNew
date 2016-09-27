package com.abhi.controller.student;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * all methods are applicable to the all the controller class
 * @author Abhishek.Kumar
 *
 */
@ControllerAdvice
public class GlobalExceptionHandlerMethods {

	/**
	 * ---------------------------------------------------------------------------------------------------------------
	 */
	
	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException(Exception e){
		System.out.println("Null pointer Exception occured :"+ e);
		
		return "NullPointerException"; // this the view name i.e jsp page name
	}
	
	@ExceptionHandler(value = IOException.class)
	public String handleIOException(Exception e){
		System.out.println("IO Exception occured :"+ e);
		
		return "IOException"; // this the view name i.e jsp page name
	}
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = Exception.class)
	public String handleException(Exception e){
		System.out.println("Unknown Exception occured :"+ e);
		
		return "Exception"; // this the view name i.e jsp page name
	}
	
	/**
	 * ---------------------------------------------------------------------------------------------------------------
	 */
}

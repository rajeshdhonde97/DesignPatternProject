package com.velocity.custom.exception;

public class AgeInvalidException extends RuntimeException{
	
	public AgeInvalidException(String msg){
		System.out.println(msg);
	}
	

}

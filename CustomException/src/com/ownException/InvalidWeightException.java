package com.ownException;

public class InvalidWeightException extends RuntimeException{
      
	public InvalidWeightException(String msg) {
		System.out.println(msg);
	}
}

package com.wipro.ccbill.exception;

public class InputValidationException extends Exception{
	public InputValidationException(String str) {
		return;
	}

	

	public String toString()
	{
		return("Invalid Input Data");
	}
}

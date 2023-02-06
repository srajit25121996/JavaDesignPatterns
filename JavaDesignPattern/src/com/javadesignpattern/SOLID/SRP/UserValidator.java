package com.javadesignpattern.SOLID.SRP;

public class UserValidator {

	public boolean validateUser(User userJSON) {
		
		return isValidUser(userJSON);
	}
	//Validate User Object 
		private boolean isValidUser(User userJSON) {
			if(userJSON.getName().length()>0 && userJSON.getEmail().contains("@gmail.com"))
				return true;
			
			return false;
		}
		
	
}

package com.javadesignpattern.SOLID.SRP;

public class UserController {

	//There are mutliple reason to change the User Controller class.
	//:: hence it is voilating Single responsibility Principle 
	
	//moving voilation code specific classes
	private Store store=new Store();
	
	//Create a new user 
	
	
	private UserPersistenceService persistenceService = new UserPersistenceService();
	
	public String createUser (User userJSON)throws Exception{
		UserValidator validator=new UserValidator();
		boolean valid= validator.validateUser(userJSON);

		
		if(!valid) {
			
			return "ERROR";
		}
		//store.store(userJSON);
		persistenceService.saveUser(userJSON);
		return "SUCCESS";
		
	}
	
	
	/*
	 * //Validate User Object private boolean isValidUser(User userJSON) {
	 * if(userJSON.getName().length()>0 &&
	 * userJSON.getEmail().contains("@gmail.com")) return true;
	 * 
	 * return false; }
	 */
	
	
	
	
	
	
}

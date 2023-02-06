package com.javadesignpattern.SOLID.SRP;

public class Main {

	public static void main(String[] args) throws Exception {
		
     User VALID_USER_JSON=new User("Shubham", "shubhamrajit00@gmail.com", "110 bek street US");
     User INVALID_USER_JSON=new User("", "cvb21@gmail.com", "322 crank hill US");
     
     UserController controller=new UserController();
     String response=controller.createUser(VALID_USER_JSON);
     if(!response.equalsIgnoreCase("SUCCESS")) {
     System.err.println("Failed");
     }
     
     System.out.println("Valid JSON response received "+ response);
	
	
	 response=controller.createUser(INVALID_USER_JSON);
     if(!response.equalsIgnoreCase("ERROR")) {
     System.err.println("Failed");
     }
     
     System.out.println("Invalid JSON response received "+ response);
	}
	
	

}

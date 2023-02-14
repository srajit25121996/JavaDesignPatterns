package com.javadesignpattern.CREATIONAL.builder;

import java.time.LocalDate;

public class MainDirector {

	public static void main(String[] args) {

		User user=createUser();
		UserDTOBuilder builder=new UserWebDTOBuilder();
		UserDTO dto=directBuilder(builder, user);
		System.out.println(dto);
		
		
	}

	
	private static UserDTO directBuilder(UserDTOBuilder builder,User user) {
		return builder.withFirstName(user.getFirstName())
		       .withLastName(user.getLastName())
		       .withAddress(user.getAddress())
		       .withBirthday(user.getBirthday())
		       .build();
		 
	}
	
	/*
	 * 
	 * Return a sample user
	 * */
    public static User createUser() {
    	
    	User user=new User();
		user.setBirthday(LocalDate.of(1998,5,6));
		user.setFirstName("Ron");
		user.setLastName("Swanson");
		Address address= new Address();
		address.setHouseNumber("100");
		address.setStreet("State Street");
		address.setCity("Pawnee");
		address.setState("Indiana");
		address.setZipcode("4799923");
		user.setAddress(address);
    
		return user;
    }

}

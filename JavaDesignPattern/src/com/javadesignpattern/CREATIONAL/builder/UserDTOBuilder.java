package com.javadesignpattern.CREATIONAL.builder;

import java.time.LocalDate;

public interface UserDTOBuilder {
	//method to use part of product at a time
	
	UserDTOBuilder withFirstName(String fname);

	UserDTOBuilder withLastName(String lName);

	UserDTOBuilder withBirthday(LocalDate date);

	UserDTOBuilder withAddress(Address address);
	//method to "assemble" final product
	UserDTO build();
	//(optional) method to fetch already built object
	UserDTO getUserDTO();

}

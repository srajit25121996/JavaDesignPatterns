package com.javadesignpattern.SOLID.OpenCloseP;


public class PhoneSubscriber extends Subscriber{

	@Override
	public double calculateBill() {
		System.out.println(" Phone Subscriber.");
		return 145;
	}

	//these four properties are common and asper open close principle we should have a base class,
	//that should be closed for modification and open for extention
	
	//hence we will create a base and move all common properties to that class
	
	/*
	 * private long subscriberId; private String address; private long phoneNumber;
	 * private int baseRate;
	 * 
	 */

	
}

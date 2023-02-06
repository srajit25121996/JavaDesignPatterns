package com.javadesignpattern.SOLID.OpenCloseP;


public class ISPSubscriber extends Subscriber {

	
	private long freeUsage;
	
	

	
	
	public long getFreeUsage() {
		return freeUsage;
	}


	public void setFreeUsage(long freeUsage) {
		this.freeUsage = freeUsage;
	}


	@Override
	public double calculateBill() {
		System.out.println(" ISP Subscriber.");
		return 160;
	}


	
	
	

	
	
	
}

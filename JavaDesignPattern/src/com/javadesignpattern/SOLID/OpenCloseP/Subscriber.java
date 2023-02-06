package com.javadesignpattern.SOLID.OpenCloseP;

public abstract class Subscriber {

	
	private long subscriberId;
	private String address;
	private long phoneNumber;
	private int baseRate;
	
	
	public abstract double calculateBill() ; // open for extension
	
	
	public long getSubscriberId() {
		return subscriberId;
	}
	public void setSubscriberId(long subscriberId) {
		this.subscriberId = subscriberId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getBaseRate() {
		return baseRate;
	}
	public void setBaseRate(int baseRate) {
		this.baseRate = baseRate;
	}
	
	
	
}

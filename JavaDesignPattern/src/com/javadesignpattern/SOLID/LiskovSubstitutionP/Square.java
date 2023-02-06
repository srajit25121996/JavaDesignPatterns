package com.javadesignpattern.SOLID.LiskovSubstitutionP;

public class Square implements Shape {
	

	//public class Square extends Rectangle {

	/*
	 * public Square(int side) { super(side, side);
	 * 
	 * }
	 */
	
	//we are violating the Liskov substitution with below  two methods
    // we can use a Interface named a shape that should have  common functionality
	/*
	 * @Override public void setWidth(int width) { setSide(width); }
	 * 
	 * @Override public void setHeight(int height) { setSide(height); } public void
	 * setSide(int side) { super.setWidth(side); super.setHeight(side); }
	 * 
	 * @Override public int calculateArea() { // TODO Auto-generated method stub
	 * return 0; }
	 */
	
	/* SOLUTION*/
	
	private int side;
	
	public Square(int side) {
		this.side=side;
	}
	
	public void setSide(int side) {
		this.side=side;
	}
	
	public int getSide() {
		 return side;
	}

	@Override
	public int calculateArea() {
		return side*side;
	}
	
	
	
	
}

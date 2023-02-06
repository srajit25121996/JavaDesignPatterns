package com.javadesignpattern.SOLID.LiskovSubstitutionP;

public class Main {

	public static void main(String[] args) {

		Rectangle rectangle=new Rectangle(10, 20);
		System.out.println(rectangle.calculateArea());
		
		Square square=new Square(20);
		System.out.println(square.calculateArea());
		useRectangle(rectangle);
		//Commented for solution ------ useRectangle(square);
		
	}
	
	private static void useRectangle(Rectangle rectangle) {
		rectangle.setHeight(20);
		rectangle.setWidth(30);
		
		assert rectangle.getHeight()==20:"Height Not equals to 20";
		assert rectangle.getWidth()==30:"Width Not equals to 30";
	} 

}

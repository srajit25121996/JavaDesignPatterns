package com.javadesignpattern.CREATIONAL.simplefactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Post post=PostFactory.createPost("blog");
		System.out.println(" Type of Post is : "+post);
		
		Post post1=PostFactory.createPost("product");
		System.out.println(" Type of Post is : "+post1);
		
		Post post2=PostFactory.createPost("news");
		System.out.println(" Type of Post is : "+post2);
		

	}

}

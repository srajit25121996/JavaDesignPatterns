package com.javadesignpattern.CREATIONAL.simplefactory;

public class PostFactory {
	
	public static Post createPost(String type) {
		type=type.toLowerCase();
		
		switch(type) {
		case "blog":
			 return new BlogPost();
		case "news":
			
			return new NewsPost();
		case "product":
		 return new ProductPost();
			
		default:
			
			 throw new IllegalArgumentException("Post type unknown");
		
		}
		
		
	}
	
	

}

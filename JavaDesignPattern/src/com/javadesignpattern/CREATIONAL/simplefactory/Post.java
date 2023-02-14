package com.javadesignpattern.CREATIONAL.simplefactory;

import java.time.LocalDate;

public abstract class Post {

	private long id;
	private String title;
	private String content;
	private LocalDate createdOn;
	private LocalDate publishedOn;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LocalDate getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}
	public LocalDate getPublishedOn() {
		return publishedOn;
	}
	public void setPublishedOn(LocalDate publishedOn) {
		this.publishedOn = publishedOn;
	}
	
	
}

package com.bptn.course.week4.jUnitBooks;

public class Book {
	
	//instance variables
	private String title;
	private double price;
	
	//constructor
	public Book(String title, double price) {
		this.title=title;
		this.price=price;
	}
	
	//getter method getTitle() to return title
	public String getTitle() {
		return this.title;
	}


	
	public String getBookInfo() {
		return this.title +"-" + this.price;
	}
	
	

}

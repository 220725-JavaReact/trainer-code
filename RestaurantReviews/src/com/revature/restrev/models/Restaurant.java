package com.revature.restrev.models;
// package that your class belongs to is listed at the top of the file 
public class Restaurant {
	// public - access modifier
	// class - type you're creating 
	// Restaurant - class name
	
	// members of a class:
	// variables/fields - contains datatypes
	//					- properties, state, characteristics of a class 
	// constructor - similar to a method, they're special, called when class is initialized into an object
	//				- used for setting up initial state of your objects 
	// 				3 types:default constructor(created by compiler), 
	//						no args constructor (defined by developer)
	//						parameterized constructor (defined by developer)
	// when you have multiple constructors defined in 1 class: this an example of method overloading
	// which is an implementation of polymorphism
	// methods - behavior of the class
	
	//fields
	public String name;
	// write only
	private String city;
	private String state;
	private int rating;
	public String description; 
	
	
	public int getRating() {
		return rating;
	}


	public void setRating(int rating) throws Exception {
		if(rating < 0 || rating > 5) throw new Exception("Invalid rating. Please enter something between 0-5");
		this.rating = rating;
	}

	// readonly that returns city and state
	public String getAddress() {
		return this.city +","+ this.state;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public void setState(String state) {
		this.state = state;
	}


	//methods
	// how sysout will print out your object 
	// this is the string version of your object
	@Override
	public String toString()
	{
		return "Name: "+this.name+"\nAddress: "+this.getAddress()+"\nRating: "+this.rating+"\nDescription: "+this.description;
	}

}

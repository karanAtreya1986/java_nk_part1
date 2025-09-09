package com.day20;

public abstract class page6 {
	
	//abstract class need not have abstract methods mandatorily.
	
	//create non abstract method with return.
	public boolean unloading() {
		System.out.println("Page is unloading...");
		return true;
	}
	
	//create non abstract method without return.
	public void loading() {
		System.out.println("Page is loading...");
	}
	
	//The abstract method getdetails in type page6 can only set 
	//a visibility modifier, one of public or protected
	//cannot have abstract and final method together.
	public abstract final void getdetails(String name);

}

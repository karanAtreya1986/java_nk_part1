package com.day20;

public abstract class page12 {
	
	String name;
	int id;
	
	
	//create one abstract method with return.
	public abstract boolean unloading();
	
	//create one abstract method without return.
	public abstract void loading();
	
	//create normal method with return.
	public String url() {
		System.out.println("parent class url method");
		return "gorilla";
	}
	
	//create normal method without return.
	public void title() {
		System.out.println("parent class login title  method");
	}

}

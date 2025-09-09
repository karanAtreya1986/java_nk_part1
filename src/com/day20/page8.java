package com.day20;

public abstract class page8 {
	
	String name;
	int id;
	
	//constructor allowed in abstract class.
	public page8() {
		System.out.println("default constructor");
	}
	
	public page8(String name, int id) {
		this.name=name;
		this.id=id;
	}
	
	
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

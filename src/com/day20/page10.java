package com.day20;

public abstract class page10 {
	
	String name;
	int id;
	
	//only parameter constructor.	
	public page10(String name, int id) {
		this.name=name;
		this.id=id;
		System.out.println(this.name);
		System.out.println(this.id);
		System.out.println("parent class param constructor.");
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

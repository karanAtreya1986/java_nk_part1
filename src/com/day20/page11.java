package com.day20;

public abstract class page11 {
	
	//only parameter constructor.	
	public page11(String name, int id) {
		this.name=name; //when variable not declared then error.
		//name cannot be resolved or is not a field
		this.id=id;
		//id cannot be resolved or is not a field
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

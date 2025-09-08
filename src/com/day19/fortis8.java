package com.day19;

//can implement multiple interface.
public class fortis8 implements usmedical8{

	@Override
	public void physio() {
		System.out.println("fortis physio");		
	}

	@Override
	public String onco() {
		System.out.println("fortis onco");	
		return "tiger";
	}

	@Override
	public void dental() {
		System.out.println("fortis dental");	
	}

	@Override
	public void emergency() {
		System.out.println("fortis emergency");	
	}
	
	//not mandatory to override static method.
	//if we write override, we get error.
	//The method getstatic1(String) of type fortis8 must override or implement a supertype method
//	@Override
//	public static int getstatic1(String name) {
//		System.out.println("get static 1 method");
//		return 10;
//	}
	
	public static int getstatic1(String name) {
		System.out.println("get static 1 method from child class");
		return 190;
	}

	

}

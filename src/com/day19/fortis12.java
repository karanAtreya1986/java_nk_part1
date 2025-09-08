package com.day19;

//can implement multiple interface.
public class fortis12 implements usmedical12{
	
	public void physio() {
		System.out.println("physio");
	}
	public void onco() {
		System.out.println("onco");
	}
	public void dental() {
		System.out.println("dental");
	}
	
	//The method getstatic(String) of type fortis12 must override or implement a supertype method
	//cannot use override for static method.
//	@Override
//	public static String getstatic(String name) {
//		System.out.println("static method" + name);
//		return "tiger";
//	}
	
	//without override it works.
	//treated like another method.
	public static String getstatic(String name) {
	System.out.println("static child class method" + name);
	return "lion";
}

}

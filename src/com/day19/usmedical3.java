package com.day19;

public interface usmedical3 {

	public void physio();
	public String onco();
	public void dental();

	//common method in all interfaces.
	public void emergency();

	//static method inside interface.
	public static int getstatic(String name) {
		System.out.println("static method" + name);
		return 10;
	}

	//final method inside interface.
	//Illegal modifier for the interface method getfinal; only public, private, 
	//abstract, default, static and strictfp are permitted
//	public final int getfinal(String name) {
//		System.out.println("static method" + name);
//		return 10;
//	}
	
	//Illegal modifier for the interface method getfinalandstatic; 
	//only public, private, abstract, default, static and strictfp are permitted
	public final static int getfinalandstatic(String name) {
		System.out.println("static method" + name);
		return 10;
	}
	
	//Illegal modifier for the interface method getfinal; only public, 
	//private, abstract, default, static and strictfp are permitted
	public final int getfinal(String name);
	
	//This method requires a body instead of a semicolon
	public final static int getfinalandstatic(String name);



}

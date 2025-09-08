package com.day19;

public interface usmedical7 {

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
	
	//static method inside interface.
	//This method requires a body instead of a semicolon
	//static methods have to be implemented where declared else error.
		public static int getstatic1(String name);

}

package com.day19;

public interface usmedical11 {
	
	//in interface we can have static method but we have to define it.
	//create one static method
	public static String getstatic(String name) {
		System.out.println("static method" + name);
		return "tiger";
	}
	
	//if no definition then error-
//	This method requires a body instead of a semicolon
//	public static String getstatic1(String name);

}

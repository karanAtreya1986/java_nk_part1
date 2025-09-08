package com.day19;

public interface usmedical14 {
	
	int MINFEE=214234; //by default public static final.
	
	//in interface we can have default method.
	//but it has to have body.
	
	//create default method.
	default int getdefault(String name) {
		System.out.println("first default from interface" + name);
		return 10;
	}
	
	
//n number of default and static methods allowed.
	default void getdefault1(String name) {
		System.out.println("second default from interface" + name);
	}
	
	//Illegal modifier for the interface method getstatic1; only public, private, abstract, default, static and strictfp are permitted
//	public static final int getstatic1(String name) {
//		System.out.println("third default from interface" + name);
//		return 10;
//	}
	
	public static void getstatic2(String name) {
		System.out.println("first static from interface" + name);
	}

	public static int getstatic1(String name) {
		System.out.println("second static from interface" + name);
		return 10;
	}
}

package com.day19;

//can implement multiple interface.
public class fortis14 implements usmedical14{
	
	int MINFEE=654657567;
	
	//Cannot reduce the visibility of the inherited method from usmedical14
//	@Override
//	default int getdefault(String name) {
//		System.out.println("first default from interface" + name);
//		return 10;
//	}
	
	//Cannot reduce the visibility of the inherited method from usmedical14
//	default int getdefault(String name) {
//		System.out.println("first default from interface" + name);
//		return 10;
//	}
	
	//Cannot reduce the visibility of the inherited method from usmedical14
//	@Override
//	default void getdefault1(String name) {
//		System.out.println("second default from interface" + name);
//	}
	
//Cannot reduce the visibility of the inherited method from usmedical14
//	default void getdefault1(String name) {
//		System.out.println("second default from interface" + name);
//	}
	
	//The method getstatic2(String) of type fortis14 must override or implement a supertype method
//	@Override
//	public static void getstatic2(String name) {
//		System.out.println("first static from interface" + name);
//	}
	
	public static void getstatic2(String name) {
		System.out.println("first static from child class" + name);
	}
	
	//The method getstatic1(String) of type fortis14 must override or implement a supertype method
//	@Override
//	public static int getstatic1(String name) {
//		System.out.println("second static from interface" + name);
//		return 10;
//	}
	
	
	public static int getstatic1(String name) {
		System.out.println("second static from child class" + name);
		return 10;
	}
	
	


}

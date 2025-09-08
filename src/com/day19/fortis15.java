package com.day19;

//can implement multiple interface.
public class fortis15 implements usmedical15{
	
	int MINFEE=654657567;
	
	//change default to another access specifier to use it.
	@Override
	public int getdefault(String name) {
		System.out.println("first default from child class" + name);
		return 10;
	}
	
	
//	protected int getdefault(String name) {
//		System.out.println("first default from interface" + name);
//		return 10;
//	}
	
	//Cannot reduce the visibility of the inherited method from usmedical15
	//protected not allowed.
//	@Override
//	protected void getdefault1(String name) {
//		System.out.println("second default from interface" + name);
//	}
	
	//Cannot reduce the visibility of the inherited method from usmedical15
	//cannot have private.
//	@Override
//	private void getdefault1(String name) {
//		System.out.println("second default from interface" + name);
//	}
	
	//only public allowed.
	@Override
	public void getdefault1(String name) {
		System.out.println("second default from child class" + name);
	}
	
//Cannot reduce the visibility of the inherited method from usmedical14
//	default void getdefault1(String name) {
//		System.out.println("second default from interface" + name);
//	}
	
	//The method getstatic2(String) of type fortis14 must override or implement a supertype method
	//cannot use override with static.
//	@Override
//	public static void getstatic2(String name) {
//		System.out.println("first static from interface" + name);
//	}
	
	//without override works, method hiding.
	public static void getstatic2(String name) {
		System.out.println("first static from child class" + name);
	}
	
	//The method getstatic1(String) of type fortis14 must override or implement a supertype method.
	//cannot use override with static.
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

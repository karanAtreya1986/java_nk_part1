package com.day22;

public class exception11 {
	
	String name;
	
	//both exceptions come.
	//have exceptions in different try blocks.

	public static void main(String[] args) {

		System.out.println("start of the code");
		
		try {
			
			exception11 e1=new exception11();
			e1=null;
			e1.name=null;
			e1.name="karan";
			System.out.println(e1.name);
		}
		catch (NullPointerException e) {
			System.out.println("null pointer exception handled");
			e.printStackTrace();
		}
		try {
			int i=9/0;
			System.out.println("after exception try block");
		}
		catch (ArithmeticException e) {
			System.out.println("arithmetic exception handled");
			e.printStackTrace();
		}
		
		

		System.out.println("outside blocks");
	}

}

//start of the code
//null pointer exception handled
//java.lang.NullPointerException: Cannot assign field "name" because "e1" is null
//	at com.day22.exception11.main(exception11.java:18)
//arithmetic exception handled
//java.lang.ArithmeticException: / by zero
//	at com.day22.exception11.main(exception11.java:27)
//outside blocks








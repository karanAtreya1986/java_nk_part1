package com.day22;

public class exception14 {
	
	String name;
	
	//write master class exceptions for any exceptions.
	//one catch will be enough.

	public static void main(String[] args) {

		System.out.println("start of the code");
		
		try {
			
			exception14 e1=new exception14();
			e1=null;
			e1.name=null;
			System.out.println(e1.name);
		}
		catch (Exception e) {
			System.out.println("null pointer exception handled");
			e.printStackTrace();
		}
		try {
			int i=9/0;
			System.out.println("after exception try block");
		}
		catch (Exception e) {
			System.out.println("arithmetic exception handled");
			e.printStackTrace();
		}
		
		

		System.out.println("outside blocks");
	}

}

//start of the code
//null pointer exception handled
//java.lang.NullPointerException: Cannot assign field "name" because "e1" is null
//	at com.day22.exception14.main(exception14.java:18)
//arithmetic exception handled
//java.lang.ArithmeticException: / by zero
//	at com.day22.exception14.main(exception14.java:26)
//outside blocks









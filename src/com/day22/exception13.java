package com.day22;

public class exception13 {
	
	String name;
	
	//catch arithmetic not npe.

	public static void main(String[] args) {

		System.out.println("start of the code");
		
		try {
			
			exception13 e1=new exception13();
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
//karan
//arithmetic exception handled
//java.lang.ArithmeticException: / by zero
//	at com.day22.exception13.main(exception13.java:24)
//outside blocks









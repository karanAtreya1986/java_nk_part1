package com.day22;

public class exception5 {

	public static void main(String[] args) {

		System.out.println("start of the code");
		
		try {
			int i=9/0;
		}
		catch (ArithmeticException e) {
			System.out.println("arithmetic exception handled");
			//print stack trace.
			e.printStackTrace();//returns void
		}
		
		System.out.println("outside blocks");
	}

}

//start of the code
//arithmetic exception handled
//java.lang.ArithmeticException: / by zero
//	at com.day22.exception5.main(exception5.java:10)
//outside blocks



package com.day22;

public class exception6 {

	public static void main(String[] args) {

		System.out.println("start of the code");

		//in try lines after exception dont run.
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
//arithmetic exception handled
//java.lang.ArithmeticException: / by zero
//	at com.day22.exception6.main(exception6.java:10)
//outside blocks




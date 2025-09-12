package com.day22;

public class exception17 {

	String name;

	//catch arithmetic using exception.

	public static void main(String[] args) {

		System.out.println("start of the code");

		try {

			exception17 e1=new exception17();
			e1.name="karan";
			System.out.println(e1.name);
			int i=9/0;
			System.out.println("after exception try block");
		}
		catch (Exception e) {
			System.out.println("Catch block with exception");
			e.printStackTrace();
		}

		System.out.println("outside blocks");
	}

}

//start of the code
//karan
//Catch block with exception
//java.lang.ArithmeticException: / by zero
//	at com.day22.exception17.main(exception17.java:18)
//outside blocks










package com.day22;

public class exception19 {

	String name;

	//catch exceptions using object.

	public static void main(String[] args) {

		System.out.println("start of the code");

		try {

			exception19 e1=new exception19();
			e1=null;
			e1.name=null;
			System.out.println(e1.name);
			int i=9/0;
			System.out.println("after exception try block");
		}
		//No exception of type Object can be thrown; 
		//an exception type must be a subclass of Throwable
		catch (Object e) {
			System.out.println("Catch block with exception");
			e.printStackTrace();
		}

		System.out.println("outside blocks");
	}

}

//start of the code
//Catch block with exception
//java.lang.NullPointerException: Cannot assign field "name" because "e1" is null
//	at com.day22.exception18.main(exception18.java:17)
//outside blocks










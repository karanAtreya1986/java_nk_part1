package com.day22;

public class exception26 {

	String name;

	//try handling error with try catch block.
	//cant handle exceptions.
	
	public static void main(String[] args) {

		System.out.println("start of the code");

		try {

			exception26 e1=new exception26();
			e1=null;
			e1.name=null;
			System.out.println(e1.name);
			int i=9/0;
			System.out.println("after exception try block");
		}
		
		catch (Error e) {
			System.out.println("Catch block with exception");
			e.printStackTrace();
		}
		
		System.out.println("outside blocks");
	}

}

//start of the code
//Exception in thread "main" java.lang.NullPointerException: Cannot assign field "name" because "e1" is null
//	at com.day22.exception26.main(exception26.java:17)













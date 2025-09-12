package com.day22;

public class exception15 {
	
	String name;
	
	//write master class exceptions for any exceptions.
	//one catch will be enough.

	public static void main(String[] args) {

		System.out.println("start of the code");
		
		try {
			
			exception15 e1=new exception15();
			e1=null;
			e1.name=null;
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
//Catch block with exception
//java.lang.NullPointerException: Cannot assign field "name" because "e1" is null
//	at com.day22.exception15.main(exception15.java:18)
//outside blocks










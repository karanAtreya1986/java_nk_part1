package com.day22;

public class exception8 {
	
	String name;
	
	//write exception in catch which doesnt come.
	//program terminates as we have not given proper exception name.

	public static void main(String[] args) {

		System.out.println("start of the code");
		
		try {
			
			exception8 e1=new exception8();
			e1=null;
			e1.name=null;
			e1.name="karan";
			System.out.println(e1.name);
			
			int i=9/4;
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
//Exception in thread "main" java.lang.NullPointerException: 
//	Cannot assign field "name" because "e1" is null
//	at com.day22.exception8.main(exception8.java:18)






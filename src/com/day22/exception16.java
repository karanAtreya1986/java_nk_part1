package com.day22;

public class exception16 {
	
	String name;
	
	//catch arithmetic using exception.

	public static void main(String[] args) {

		System.out.println("start of the code");
		
		try {
			
			exception16 e1=new exception16();
			e1=null;
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
//Catch block with exception
//java.lang.NullPointerException: Cannot assign field "name" because "e1" is null
//	at com.day22.exception16.main(exception16.java:17)
//outside blocks










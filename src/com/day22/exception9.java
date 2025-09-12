package com.day22;

public class exception9 {
	
	String name;
	
	//add proper exception in catch and it works.

	public static void main(String[] args) {

		System.out.println("start of the code");
		
		try {
			
			exception9 e1=new exception9();
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
		
		catch (NullPointerException e) {
			System.out.println("null pointer exception handled");
			e.printStackTrace();
		}

		System.out.println("outside blocks");
	}

}

//start of the code
//null pointer exception handled
//java.lang.NullPointerException: Cannot assign field "name" because "e1" is null
//outside blocks
//	at com.day22.exception9.main(exception9.java:17)







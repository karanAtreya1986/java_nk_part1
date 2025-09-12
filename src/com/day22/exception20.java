package com.day22;

public class exception20 {

	String name;

	//write top exception at top.
	//lower exceptions at bottom.
	//not allowed.

	public static void main(String[] args) {

		System.out.println("start of the code");

		try {

			exception20 e1=new exception20();
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
		
		//Unreachable catch block for ArithmeticException. 
		//It is already handled by the catch block for Exception
		catch (ArithmeticException e) {
			System.out.println("Catch block with arithmetic exception");
			e.printStackTrace();
		}
		
		//Unreachable catch block for NullPointerException. 
		//It is already handled by the catch block for Exception
		catch (NullPointerException e) {
			System.out.println("Catch block with  NullPointerException exception");
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










package com.day22;

public class exception23 {

	String name;

	//write higher exception at top and lower at bottom.
	//not allowed.

	public static void main(String[] args) {

		System.out.println("start of the code");

		try {

			exception23 e1=new exception23();
			e1=null;
			e1.name=null;
			System.out.println(e1.name);
			int i=9/0;
			System.out.println("after exception try block");
		}

		catch (Throwable e) {
			System.out.println("Catch block with exception");
			e.printStackTrace();
		}
		
		//error when lower exception is present.
		//Unreachable catch block for Exception. 
		//It is already handled by the catch block for Throwable
		catch (Exception e) {
			System.out.println("Catch block with exception");
			e.printStackTrace();
		}

		//Unreachable catch block for ArithmeticException. 
		//It is already handled by the catch block for Throwable
		catch (ArithmeticException e) {
			System.out.println("Catch block with arithmetic exception");
			e.printStackTrace();
		}

		//Unreachable catch block for NullPointerException. 
		//It is already handled by the catch block for Throwable
		catch (NullPointerException e) {
			System.out.println("Catch block with  NullPointerException exception");
			e.printStackTrace();
		}



		System.out.println("outside blocks");
	}

}

//start of the code
//Catch block with  NullPointerException exception
//java.lang.NullPointerException: Cannot assign field "name" because "e1" is null
//	at com.day22.exception21.main(exception21.java:18)
//outside blocks











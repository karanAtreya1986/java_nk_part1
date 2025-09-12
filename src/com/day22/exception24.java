package com.day22;

public class exception24 {

	String name;

	//write exception at top.
	//then write throwable.
	//its fine.

	public static void main(String[] args) {

		System.out.println("start of the code");

		try {

			exception24 e1=new exception24();
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

		catch (Throwable e) {
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











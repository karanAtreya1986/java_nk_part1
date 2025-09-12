package com.day22;

public class exception7 {

	public static void main(String[] args) {

		System.out.println("start of the code");
		
		//when no exception but still try catch.
		//does not go into catch block.

		try {
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
//after exception try block
//outside blocks





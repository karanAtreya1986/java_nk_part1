package com.day22;

public class exception4 {

	public static void main(String[] args) {

		System.out.println("start of the code");
		
		try {
			int i=9/0;
		}
		catch (ArithmeticException e) {
			System.out.println("arithmetic exception handled");
		}
		
		System.out.println("outside blocks");
	}

}

//start of the code
//arithmetic exception handled
//outside blocks


package com.day23;

public class finally6 {
	
	public static void main(String[] args) {
		
		System.out.println("first line");
		
		try {
			int i=9/3;
			System.out.println("try block");
		}
		catch(ArithmeticException e) {
			System.out.println("Catch block");
		}
		finally {
			System.out.println("finally block");
		}
		//Syntax error on token "finally", delete this token
		//multiple finally block not allowed.
		finally {
			System.out.println("finally block");
		}
		
		System.out.println("last line");
	}

}




package com.day23;

public class finally8 {
	
	public static void main(String[] args) {
		
		System.out.println("first line");
		
		try {
			int i=9/3;
			System.out.println("try block");
		}
		
		finally {
			System.out.println("finally block");
		}
		//Syntax error on token "catch", invalid RecordHeaderName
		//improper sequence not allowed.
		catch(ArithmeticException e) {
			System.out.println("Catch block");
		}
		
		System.out.println("last line");
	}

}



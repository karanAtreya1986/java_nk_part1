package com.day23;

public class finally3 {
	
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
		
		System.out.println("last line");
	}

}

//first line
//try block
//finally block
//last line



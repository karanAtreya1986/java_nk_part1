package com.day23;

public class finally10 {
	
	public static void main(String[] args) {
		
		System.out.println("first line");
		
		try {
			int i=9/0;
			System.out.println("try block");
		}
		catch(ArithmeticException e) {
			System.out.println("Catch block");
		}
		finally {
			System.out.println("finally block");
		}
		

		try {
			String s=null;
			System.out.println(s.length());
			
		}
		catch(NullPointerException e) {
			System.out.println("Catch block");
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("last line");
	}

}

//first line
//Catch block
//finally block
//Catch block
//finally block
//last line




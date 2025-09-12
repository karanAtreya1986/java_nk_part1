package com.day23;

public class finally11 {
	
	public static void main(String[] args) {
		
		//nesting of try catch also allowed.
		
		System.out.println("first line");
		
		try {
			int i=9/0;
			System.out.println("try block");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				System.out.println("catch block");
			}
			finally {
				System.out.println("inner block");
			}
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




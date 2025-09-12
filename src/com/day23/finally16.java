package com.day23;

public class finally16 {
	
	public static void main(String[] args) {
		
		//loops also can be written inside try block.
		
		System.out.println("first line");
		
		try {
			int i=9/0;
			while(true) {
				break;
			}
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
//Catch block
//finally block
//last line





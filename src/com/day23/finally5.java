package com.day23;

public class finally5 {
	
	public static void main(String[] args) {
		
		//catch and finally cannot come alone.
		
		System.out.println("first line");
		
	//Syntax error on token "catch", ( expected
		catch(ArithmeticException e) {
			System.out.println("Catch block");
		}
		//Syntax error on token "finally", delete this token
		finally {
			System.out.println("finally block");
		}
		
		System.out.println("last line");
	}

}




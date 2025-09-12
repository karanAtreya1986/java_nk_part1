package com.day23;

public class finally1 {
	
	public static void main(String[] args) {
		
		System.out.println("first line");
		//finally cannot come alone.
		//Syntax error on token "finally", delete this token
		finally {
			System.out.println("finally block");
		}
	}

}

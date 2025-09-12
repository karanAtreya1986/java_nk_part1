package com.day23;

public class finally13 {
	
	public static void main(String[] args) {
		
		//when no error then smooth.
		
		
		System.out.println("first line");
		
		try {
			int i=9/3;
			System.out.println("try block");
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



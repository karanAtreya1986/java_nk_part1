package com.day23;

public class finally4 {
	
	public static void main(String[] args) {
		
		//try with finally block.
		//not smooth.
		//lines after finally and code is ignored.
		System.out.println("first line");
		
		try {
			int i=9/0;
			System.out.println("try block");
		}
		finally {
			System.out.println("finally block");
		}
		
		System.out.println("last line");
	}

}

//first line
//finally block
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at com.day23.finally4.main(finally4.java:10)




package com.day23;

public class finally14 {
	
	public static void main(String[] args) {
		
		//when error then not smooth.
		//all lines below finally dont run.
		
		
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
//	at com.day23.finally14.main(finally14.java:13)




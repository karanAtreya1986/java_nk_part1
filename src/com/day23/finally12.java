package com.day23;

public class finally12 {
	
	public static void main(String[] args) {
		
//		catch within catch not allowed.
		
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
			System.out.println("Catch block");//Syntax error, insert "}" to complete Block
			
			catch(InterruptedException e) {
				System.out.println("catch block");
			}
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
			//Syntax error on token "finally", delete this token
			//finally within finally not allowed.
			finally {
				System.out.println("finally block");
			}
		}
		System.out.println("last line");
	}

}





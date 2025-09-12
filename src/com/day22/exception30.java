package com.day22;

public class exception30 {
	
	/**
	 * Can handle exceptions and errors anywhere where you like
	 * in the code.
	 *it keeps going in circles and finally nothing after catch block runs
	 *in this case.
	 */
	
	public void m1() {
		System.out.println("m1");
		m2();
	}
	
	public void m2() {
		
		System.out.println("m2");
		try {
			m1();
		}
		catch (StackOverflowError e) {
			System.out.println("stack overflow inside method");
			e.printStackTrace();
		}
		//it throws this error for me.
		//just written for reference.
//		catch (NoClassDefFoundError e) {
//			System.out.println("no class def found overflow inside method");
//			e.printStackTrace();
//		}
		
		System.out.println("m2 method");
	}
	
	public static void main(String[] args) {

		System.out.println("start of the code");
		
		exception30 e1=new exception30();

		e1.m1();
		
		System.out.println("outside blocks");
	}

}


//start of the code
//m1
//m2
//m1
//m2
//m1
//m2
//m1
//m2
//m1
//m2
//m1
//m2
//m1
//m2
//m1
//m2
//stack overflow inside method
//stack overflow inside method
//java.lang.StackOverflowError
//java.lang.StackOverflowError
//stack overflow inside method
//java.lang.StackOverflowError
//stack overflow inside method
//java.lang.StackOverflowError
//stack overflow inside method
//java.lang.StackOverflowError
//stack overflow inside method
//java.lang.StackOverflowError
//stack overflow inside method
//java.lang.StackOverflowError
//stack overflow inside method
//java.lang.StackOverflowError
//stack overflow inside method
//java.lang.StackOverflowError
//stack overflow inside method
//java.lang.StackOverflowError
//stack overflow inside method
//java.lang.StackOverflowError
//Exception in thread "main" java.lang.NoClassDefFoundError: 
//Could not initialize class java.lang.StackTraceElement$HashedModules
//
//Exception: java.lang.NoClassDefFoundError thrown from
//the UncaughtExceptionHandler in thread "main"
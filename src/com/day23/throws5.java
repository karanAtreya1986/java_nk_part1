package com.day23;

import java.sql.SQLDataException;

public class throws5 {
	
	//method 1.
	
	public void m1() throws ArithmeticException, SQLDataException{
		System.out.println("m1 method");
		m2();
	}
	
	//method 2.
	public void m2() throws IndexOutOfBoundsException{
		System.out.println("m2 method");
		m3();
	}
	
	//method 3.
	public void m3() throws ArithmeticException, NullPointerException{
		System.out.println("m3 method");
		int i=9/0;
	}
	
	//main method.
	public static void main(String[] args) throws SQLDataException, ArithmeticException {
		
		throws5 b1=new throws5();
		b1.m1();//Unhandled exception type SQLDataException
		//now code doesnt know how to handle sql data exception.
		//to resolve this even main has to implement the sql and arithmetic.
		
	}

}

//m1 method
//m2 method
//m3 method
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at com.day23.throws5.m3(throws5.java:23)
//	at com.day23.throws5.m2(throws5.java:17)
//	at com.day23.throws5.m1(throws5.java:11)
//	at com.day23.throws5.main(throws5.java:30)



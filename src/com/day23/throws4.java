package com.day23;

import java.sql.SQLDataException;

public class throws4 {
	
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
	public static void main(String[] args) {
		
		throws4 b1=new throws4();
		b1.m1();//Unhandled exception type SQLDataException
		//now code doesnt know how to handle sql data exception.
		
	}

}


package com.day23;

public class throws6 {
	
	//method 1.
	public void m1() throws Throwable, ArithmeticException, IndexOutOfBoundsException{
		System.out.println("m1 method");
		m2();//Unhandled exception type Throwable
		//implement throwable here also.
		//so if lower methods throws exception,
		//higher methods or main should throws atleast that exception.
	}
	
	//method 2.
	public void m2() throws Throwable, ArithmeticException{
		System.out.println("m2 method");
		m3();
	}
	
	//method 3.
	public void m3() throws Exception, NullPointerException{
		System.out.println("m3 method");
		int i=9/0;
	}
	
	//main method.
	public static void main(String[] args) {
		
		throws6 b1=new throws6();
		b1.m1();//Unhandled exception type Throwable
		
	}

}



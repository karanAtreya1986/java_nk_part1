package com.day23;

public class throws1 {
	
	//throws multiple exceptions.
	
	//method 1.
	public void m1() throws ArithmeticException, IndexOutOfBoundsException{
		System.out.println("m1 method");
		m2();
	}
	
	//method 2.
	public void m2() throws ArithmeticException{
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
		
		throws1 b1=new throws1();
		b1.m1();
		
	}

}

//m1 method
//m2 method
//m3 method
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at com.day23.throws1.m3(throws1.java:20)
//	at com.day23.throws1.m2(throws1.java:14)
//	at com.day23.throws1.m1(throws1.java:8)
//	at com.day23.throws1.main(throws1.java:27)


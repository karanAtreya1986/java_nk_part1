package com.day23;

public class throws3 {
	
	//method 1.
	//IOException cannot be resolved to a type
	public void m1() throws ArithmeticException, IOException{
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
		
		throws3 b1=new throws3();
		b1.m1();//The method m1() from the type throws3 refers to the missing type IOException
		//when exception wont come of that type.
		
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


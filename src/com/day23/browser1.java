package com.day23;

public class browser1 {
	
	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() {
		System.out.println("m2 method");
		m3();
	}

	public void m3() {
		System.out.println("m3 method");
		int i=9/0;
	}
	
	public static void main(String[] args) {
		
		browser1 b1=new browser1();
		b1.m1();
		System.out.println("byee");
	}

}

//m1 method
//m2 method
//m3 method
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at com.day23.browser1.m3(browser1.java:17)
//	at com.day23.browser1.m2(browser1.java:12)
//	at com.day23.browser1.m1(browser1.java:7)
//	at com.day23.browser1.main(browser1.java:23)



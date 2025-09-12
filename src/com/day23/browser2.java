package com.day23;

public class browser2 {
	
	//using throws to propagate exception upto jvm.
	//no one handles it.
	//so program terminates abryptly.
	
	public void m1() throws ArithmeticException{
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() throws ArithmeticException {
		System.out.println("m2 method");
		m3();
	}

	public void m3() throws ArithmeticException{
		System.out.println("m3 method");
		int i=9/0;
	}
	
	public static void main(String[] args) throws ArithmeticException {
		
		browser2 b1=new browser2();
		b1.m1();
		System.out.println("byee");
	}

}

//m1 method
//m2 method
//m3 method
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at com.day23.browser2.m3(browser2.java:17)
//	at com.day23.browser2.m2(browser2.java:12)
//	at com.day23.browser2.m1(browser2.java:7)
//	at com.day23.browser2.main(browser2.java:23)




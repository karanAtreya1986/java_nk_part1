package com.day23;

public class throws7 {
	
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
	//method 3 not handling the correct exception
	//which is arithmetic hence all these issues.
	public void m3() throws Exception, NullPointerException{
		System.out.println("m3 method");
		int i=9/0;
	}
	
	//main method.
	public static void main(String[] args) throws 
	ArithmeticException, IndexOutOfBoundsException, Throwable {
		
		throws7 b1=new throws7();
		b1.m1();//Unhandled exception type Throwable
		//even main method has to throws all exceptions for it to work.
		
	}

}

//m1 method
//m2 method
//m3 method
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at com.day23.throws7.m3(throws7.java:25)
//	at com.day23.throws7.m2(throws7.java:17)
//	at com.day23.throws7.m1(throws7.java:8)
//	at com.day23.throws7.main(throws7.java:33)




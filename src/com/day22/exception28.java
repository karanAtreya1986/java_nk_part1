package com.day22;

public class exception28 {
	
	//tried catching error but not easy to debug.
	
	public void m1() {
		System.out.println("m1");
		m2();
	}
	
	public void m2() {
		System.out.println("m2 method");
		m1();
	}
	
	public static void main(String[] args) {

		System.out.println("start of the code");
		
		exception28 e1=new exception28();

		try {
			e1.m1();
			System.out.println("after exception try block");
		}
		
		catch (Error e) {
			System.out.println("Catch block with error");
			e.printStackTrace();
		}
		
		System.out.println("outside blocks");
	}

}

//m1
//m2 method
//m1
//m2 method
//m1
//m2 method
//Catch block with error
//java.lang.StackOverflowError
//	at java.base/java.io.BufferedOutputStream.implWrite(BufferedOutputStream.java:220)
//	at java.base/java.io.BufferedOutputStream.write(BufferedOutputStream.java:200)
//	at java.base/java.io.PrintStream.implWrite(PrintStream.java:647)
//	at java.base/java.io.PrintStream.write(PrintStream.java:627)
//	at java.base/sun.nio.cs.StreamEncoder.writeBytes(StreamEncoder.java:291)
//	at java.base/sun.nio.cs.StreamEncoder.implFlushBuffer(StreamEncoder.java:386)
//	at com.day22.exception28.m1(exception28.java:7)
//	at com.day22.exception28.m2(exception28.java:12)
//	at com.day22.exception28.m1(exception28.java:7)
//	at com.day22.exception28.m2(exception28.java:12)
//	at com.day22.exception28.m1(exception28.java:7)
//	at com.day22.exception28.m2(exception28.java:12)
//outside blocks











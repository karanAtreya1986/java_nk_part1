package com.day22;

public class exception29 {
	
	//write exact error name - stack over flow error.
	
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
		
		exception29 e1=new exception29();

		try {
			e1.m1();
			System.out.println("after exception try block");
		}
		
		catch (StackOverflowError e) {
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
//m1
//m2 method
//m1
//m2 method
//m1
//m2 method
//m1
//m2 method
//m1
//m2 method
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
//	at java.base/sun.nio.cs.StreamEncoder.lockedFlushBuffer(StreamEncoder.java:117)
//	at java.base/sun.nio.cs.StreamEncoder.flushBuffer(StreamEncoder.java:104)
//	at java.base/java.io.OutputStreamWriter.flushBuffer(OutputStreamWriter.java:194)
//	at java.base/java.io.PrintStream.implWriteln(PrintStream.java:851)
//	at java.base/java.io.PrintStream.writeln(PrintStream.java:828)
//	at java.base/java.io.PrintStream.println(PrintStream.java:1170)
//at com.day22.exception29.m1(exception29.java:9)
//at com.day22.exception29.m2(exception29.java:14)
//at com.day22.exception29.m1(exception29.java:9)
//at com.day22.exception29.m2(exception29.java:14)
//at com.day22.exception29.m1(exception29.java:9)
//at com.day22.exception29.m2(exception29.java:14)
//at com.day22.exception29.m1(exception29.java:9)
//at com.day22.exception29.m2(exception29.java:14)
//at com.day22.exception29.m1(exception29.java:9)
//at com.day22.exception29.m2(exception29.java:14)
//outside blocks












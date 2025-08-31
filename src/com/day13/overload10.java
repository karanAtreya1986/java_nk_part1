package com.day13;

public class overload10 {
	
	public void getnumber(byte a) {
		System.out.println("byte " + a);
	}	
	
	public void getnumber(short a) {
		System.out.println("short " + a);
	}
	
	public void getnumber(long a) {
		System.out.println("long " +a);
	}
	
	public static void main(String[] args) {
		
		overload10 obj = new overload10();
		obj.getnumber(10);
	}

}

//second highest precedence is for long after int.
//long 10


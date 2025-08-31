package com.day13;

public class overload4 {
	
	public void getnumber(int a) {
		System.out.println("integer " +a);
	}
	
	public void getnumber(long a) {
		System.out.println("long " + a);
	}
	
	public static void main(String[] args) {
		
		overload4 obj = new overload4();
		obj.getnumber(10L);
	}

}

//long 10
//use l or L at end and long will be called.


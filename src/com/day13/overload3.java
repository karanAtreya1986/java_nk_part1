package com.day13;

public class overload3 {
	
	public void getnumber(int a) {
		System.out.println("integer " +a);
	}
	
	public void getnumber(long a) {
		System.out.println("long " + a);
	}
	
	public static void main(String[] args) {
		
		overload3 obj = new overload3();
		obj.getnumber(10);
	}

}

//integer 10.
//int wins with long also.


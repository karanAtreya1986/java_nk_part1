package com.day13;

public class overload5 {
	
	public void getnumber(int a) {
		System.out.println("integer " +a);
	}
	
	public void getnumber(short a) {
		System.out.println("short " + a);
	}
	
	public static void main(String[] args) {
		
		overload5 obj = new overload5();
		obj.getnumber(10);
	}

}

//integer 10
//int wins against short also.


package com.day13;

public class overload7 {
	
	public void getnumber(int a) {
		System.out.println("integer " +a);
	}
	
	public void getnumber(char b) {
		System.out.println("char " + b);
	}
	
	public static void main(String[] args) {
		
		overload7 obj = new overload7();
		obj.getnumber(10);
	}

}

//integer 10
//int wins against char.



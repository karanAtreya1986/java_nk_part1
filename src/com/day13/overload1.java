package com.day13;

public class overload1 {
	
	public void getnumber(int a) {
		System.out.println("integer " +a);
	}
	
	public void getnumber(byte a) {
		System.out.println("byte " + a);
	}
	
	public static void main(String[] args) {
		
		overload1 obj = new overload1();
		obj.getnumber(10);
	}

}

//integer 10
//In java by default all numbers without decimals are int.

package com.day13;

public class overload6 {
	
	public void getnumber(int a) {
		System.out.println("integer " +a);
	}
	
	public void getnumber(short a) {
		System.out.println("short " + a);
	}
	
	public static void main(String[] args) {
		
		overload6 obj = new overload6();
		obj.getnumber((short)10);
	}

}

//to call short type cast.
//short 10



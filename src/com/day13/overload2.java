package com.day13;

public class overload2 {
	
	public void getnumber(int a) {
		System.out.println("integer " +a);
	}
	
	public void getnumber(byte a) {
		System.out.println("byte " + a);
	}
	
	public static void main(String[] args) {
		
		overload2 obj = new overload2();
		obj.getnumber((byte)10);
	}

}

//To call byte type cast it.
//byte 10


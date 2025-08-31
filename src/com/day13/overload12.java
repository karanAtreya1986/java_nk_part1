package com.day13;

public class overload12 {
	
	public void getnumber(byte a) {
		System.out.println("byte " + a);
	}	
	
	public void getnumber(short a) {
		System.out.println("short " + a);
	}
	
	
	public static void main(String[] args) {
		
		overload12 obj = new overload12();
		obj.getnumber((short)10); 
		obj.getnumber((byte)10); 
		obj.getnumber((short)'a'); 
		obj.getnumber((byte)'a'); 
	}

}



//short 10
//byte 10
//short 97
//byte 97

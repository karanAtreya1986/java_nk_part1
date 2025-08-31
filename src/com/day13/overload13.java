package com.day13;

public class overload13 {
	
	public void getnumber(byte a) {
		System.out.println("byte " + a);
	}	
	
//	public void getnumber(short a) {
//		System.out.println("short " + a);
//	}
	
	
	
	
	public static void main(String[] args) {
		
		overload13 obj = new overload13();
		obj.getnumber('a');
		//The method getnumber(byte) in the type overload13 is not applicable for the arguments (char)
		//since no int or long, so byte and short cant handle char.
		//even if we comment short and keep byte same error.
		//even if we comment byte and keep short then same error.
	}

}



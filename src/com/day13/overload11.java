package com.day13;

public class overload11 {
	
	public void getnumber(byte a) {
		System.out.println("byte " + a);
	}	
	
	public void getnumber(short a) {
		System.out.println("short " + a);
	}
	
	
	public static void main(String[] args) {
		
		overload11 obj = new overload11();
		obj.getnumber(10); 
		//The method getnumber(byte) in the type overload11 is not applicable for the arguments (int)
	}

}




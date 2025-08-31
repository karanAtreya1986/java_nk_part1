package com.day13;

public class overload8 {
	
	public void getnumber(int a) {
		System.out.println("integer " +a);
	}
	
	public void getnumber(char b) {
		System.out.println("char " + b);
	}
	
	public static void main(String[] args) {
		
		overload8 obj = new overload8();
		obj.getnumber('r');
	}

}

//char r
//to call char use single quote



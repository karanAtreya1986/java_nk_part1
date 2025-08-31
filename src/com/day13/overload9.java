package com.day13;

public class overload9 {
	
	public void getnumber(int a) {
		System.out.println("integer " +a);
	}
	

	public static void main(String[] args) {
		
		overload9 obj = new overload9();
		obj.getnumber('r');
	}

}

//integer 114
//calls ascii value when we pass char to int.



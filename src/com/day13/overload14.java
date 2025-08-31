package com.day13;

public class overload14 {
	
	public void getnumber(long a) {
		System.out.println("long " +a);
	}
	

	public static void main(String[] args) {
		
		overload14 obj = new overload14();
		obj.getnumber('r');
	}

}

//long 114
//calls ascii value when we pass char to int.



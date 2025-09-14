package com.day27;

public class stringtoboolean1 {
	
	public static void main(String[] args) {
		
		//string to boolean.
		
		String total="100.23";
		System.out.println(total+20); //100.2320
		
		boolean boolean1 = Boolean.parseBoolean(total);
		System.out.println(boolean1); //false
//		System.out.println(boolean1+20);
		//The operator + is undefined for the argument type(s) boolean, int
		
	
	}

}








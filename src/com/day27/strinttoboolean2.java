package com.day27;

public class strinttoboolean2 {
	
	public static void main(String[] args) {
		
		//int to boolean.
		//pass 1 and see what comes.
		//always shows false.
		
		String total="1";
		System.out.println(total+20); //120
		
		boolean boolean1 = Boolean.parseBoolean(total);
		System.out.println(boolean1); //false
//		System.out.println(boolean1+20);
		//The operator + is undefined for the argument type(s) boolean, int
		
	
	}

}












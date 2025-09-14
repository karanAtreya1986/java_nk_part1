package com.day27;

public class strinttoboolean1 {
	
	public static void main(String[] args) {
		
		//int to boolean.
		
		String total="100";
		System.out.println(total+20); //10020
		
		boolean boolean1 = Boolean.parseBoolean(total);
		System.out.println(boolean1); //false
//		System.out.println(boolean1+20);
		//The operator + is undefined for the argument type(s) boolean, int
		
	
	}

}










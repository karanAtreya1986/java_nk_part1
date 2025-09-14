package com.day27;

public class strinttoboolean3 {
	
	public static void main(String[] args) {
		
		//int to boolean.
		//pass zero.
		//still false.
		
		String total="0";
		System.out.println(total+20); //020
		
		boolean boolean1 = Boolean.parseBoolean(total);
		System.out.println(boolean1); //false
//		System.out.println(boolean1+20);
		//The operator + is undefined for the argument type(s) boolean, int
		
	
	}

}











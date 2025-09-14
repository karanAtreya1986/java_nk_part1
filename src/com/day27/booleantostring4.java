package com.day27;

public class booleantostring4 {
	
	public static void main(String[] args) {
		
		//convert any number/character/boolean to string using valueof.
		
		boolean t=false;
//		System.out.println(t+20); //The operator + is undefined 
		//for the argument type(s) boolean, int
		String valueOf = String.valueOf(t);
		System.out.println(valueOf); //false
		System.out.println(valueOf+20); //false20
	}

}









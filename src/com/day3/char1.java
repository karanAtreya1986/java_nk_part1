package com.day3;

public class char1 {

	//two character addition.
	
//	Mathematical operation on character will always be in ascii values.
	
//	Simply printing char name wont give ascii value-
	
	public static void main(String[] args) {
		
		char c1='a';
		char c2='B';
		String s1="selenium";
		System.out.println(c1); //a
		System.out.println(c1+c2); //163
		System.out.println(c1-c2); //31
		
		System.out.println(c1+c2+'0'+'T'); //295
		System.out.println(s1+c1+c2); //seleniumaB
		System.out.println(s1+(c1+c2)); //selenium163
	}
}

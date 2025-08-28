package com.day4;

public class incredecre14 {
	
	public static void main(String[] args) {
		
		int a=11, b=22;
		
		int c=a + b + a++ + b++ + ++a + ++b;
		
		System.out.println(a); //13
		System.out.println(b); //24
		System.out.println(c); //103 - 11+22+11(12)+22(23)+13+24
	}

}

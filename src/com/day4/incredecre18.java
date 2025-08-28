package com.day4;

public class incredecre18 {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=a++ + ++a * --a - a--;
		
//		for individual values, increment or decrement happens instantly .. 
//		only on assignments the pre and post comes into play.
		System.out.println(a); //10
		System.out.println(b); //10(11) + 12 * 11 - 11(10) //left to right.
	}

}

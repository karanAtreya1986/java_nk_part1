package com.day3;

public class maths4 {
	
	public static void main(String[] args) {
		
//		Convert to actual float by appending f-
		
		System.out.println(0.1 + 0.2f); //0.3000000029802322
		
		System.out.println(0.1f+0.2); //0.30000000149011613
		
		System.out.println(0.1f+0.2f); //0.3
		
		System.out.println(0.2+0.5); //0.7
		
		
//		System.out.println((9/0)+1); //java.lang.ArithmeticException: / by zero
//		System.out.println((9/0)+21); //java.lang.ArithmeticException: / by zero
		System.out.println((9.0/0)+1); //Infinity
		System.out.println((9.0/0)+21); //Infinity
		
		
		System.out.println((0/9)+1); //1
		System.out.println((0/9)+21); //21
		System.out.println((0/9.0)+1); //1.0
		System.out.println((0/9.0)+21); //21.0
		
		
		System.out.println((9/0.0)+1); //Infinity
		System.out.println((9/00.00)+21); //Infinity
		System.out.println((9.0/00.00)+1); //Infinity
		System.out.println((9.0/0.0)+21); //Infinity
		
		
		System.out.println((00.00/9)+1); //1.0
		System.out.println((0.0/9)+21); //21.0
		System.out.println((0.0/9.0)+1); //1.0
		System.out.println((00.000/9.0)+21); //21.0
		
		System.out.println((9.0/0.0)+1); //Infinity
		System.out.println((9.2/00.000)+21); //Infinity
		System.out.println((9.0/00.000)+1); //Infinity
		System.out.println((9.0/0.0)+21); //Infinity
		

	}

}

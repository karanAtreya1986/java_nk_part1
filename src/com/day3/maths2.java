package com.day3;

public class maths2 {
	
	public static void main(String[] args) {
		
		//get the remainder.
		
		System.out.println(10%2); //0
		System.out.println(9%2); //1
		System.out.println(100%3); //1
		
//		System.out.println(9% 0); //java.lang.ArithmeticException: / by zero
		
		System.out.println(0%10); //0
		 
		System.out.println(9% 0.0); //NaN
		
		System.out.println(0.0%10); //0.0
		
//		System.out.println(10 % 0); //java.lang.ArithmeticException: / by zero
		
		System.out.println(10.45 % 0); //NaN
		
		System.out.println(0 % 10); //0
		
		System.out.println(0000.0000 % 10.8878); //0.0
		
		System.out.println(-15.25 % -56.78); //-15.25
		
		System.out.println(-15.25 % 56.78); //-15.25
		
		System.out.println(15.25 % -56.78); //15.25
		
	}

}

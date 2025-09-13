package com.day25;

public class string18 {

	public static void main(String[] args) {

		//equals ignore case.
		//returns boolean.
		//since same at end for r2
		
		String r1 = "Hello Selenium";
		String r2 = "Hello Selenium ";
		
		boolean b1=r1.equalsIgnoreCase(r2);
		
		System.out.println(b1);//false

	}

}







package com.day3;

public class string1 {
//	
//	String is non primitive data type.
//	String is class. default class.

	public static void main(String[] args) {
		
		String name="karan";
		String num="2434";
		
		String name1="karan";
		String num1="-243erer.4234";
		
		String x="hello";
		String y="Selenium";
		
//		String a1=100; //Type mismatch: cannot convert from int to String
//		String b1=-32.34; //Type mismatch: cannot convert from double to String
		
		int a=100;
		double b=-3434.324;
		
		System.out.println(a+b); //-3334.324
		System.out.println(x+y); //helloSelenium
		System.out.println(name1+num1); //karan-243erer.4234
		System.out.println(name+num); //karan2434
		
		System.out.println(a+b+x); //-3334.324hello
		System.out.println(a+b+x+y); //-3334.324helloSelenium
		System.out.println(x+y+a+b); //helloSelenium100-3434.324
		System.out.println(a+b+x+y+a+b); //-3334.324helloSelenium100-3434.324
		System.out.println(x+y+(a+b)); //helloSelenium-3334.324	
	}

}

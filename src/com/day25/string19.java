package com.day25;

public class string19 {

	public static void main(String[] args) {

		//remove space and compare
		
		String r1 = "Hello Selenium";
		String r2 = "Hello Selenium ";
		
		String s1=r2.trim();
		boolean b1=r1.equalsIgnoreCase(s1);
		
		
		System.out.println(b1);//true


	}

}







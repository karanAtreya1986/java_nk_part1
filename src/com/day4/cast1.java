package com.day4;

public class cast1 {
	
	public static void main(String[] args) {
		
		//small value can be stored in big one by default.
		
		byte b1=10;
		
		short s1=b1;
		int i1=b1;
		float f1=b1;
		double d1=b1;
		
		System.out.println(s1); //10
		System.out.println(i1); //10
		System.out.println(f1); //10.0
		System.out.println(d1); //10.0

	}}

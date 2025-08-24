package com.day2;

public class class28 {

	public static void main(String[] args) {

		//resolve byte issue by storing result in higher data type.
		//can store from int and above only.

		//		byte b1=10;
		//		byte b2=20;
		//		short b3=b1+b2; //Type mismatch: cannot convert from int to short
		//		System.out.println(b3); 

		//	byte b1=10;
		//	byte b2=20;
		//	int b3=b1+b2; 
		//	System.out.println(b3); //30

		//	byte b1=10;
		//	byte b2=20;
		//	long b3=b1+b2; 
		//	System.out.println(b3); //30

		//	byte b1=10;
		//	byte b2=20;
		//	float b3=b1+b2; 
		//	System.out.println(b3); //30.0

		byte b1 = 10;
		byte b2 = 20;
		double b3 = b1 + b2;
		System.out.println(b3); // 30.0
	}

}

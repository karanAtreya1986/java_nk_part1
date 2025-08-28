package com.day4;

public class cast2 {
	
public static void main(String[] args) {
		
		//big value cannot be stored in small value.
		
		double b1=10;
		
//		short s1=b1; //Type mismatch: cannot convert from double to short
//		int i1=b1; //Type mismatch: cannot convert from double to int
//		float f1=b1; //Type mismatch: cannot convert from double to float
		double d1=b1;
		
		System.out.println(d1); //10.0

	}

}

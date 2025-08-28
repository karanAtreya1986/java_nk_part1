package com.day4;

public class cast3 {
	
public static void main(String[] args) {
		
		//to store big value into small use cast.
	//there can be data loss.
		
		double b1=200;
		
		short s1=(short)b1; 
		int i1=(int)b1; 
		float f1=(float)b1; 
		double d1=(double)b1;
		byte b3=(byte)b1;
		
		System.out.println(s1); //200
		System.out.println(i1); //200
		System.out.println(f1); //200.0
		System.out.println(d1); //200.0
		System.out.println(b3); //-56
		
		
		short s2=200;
		byte b2=(byte)s2;
		System.out.println(b2); //-56
//		Why we got -56-
//		Total number of characters in byte can be 256.
//		We want to store 200. So 200-256=-56.


	}

}

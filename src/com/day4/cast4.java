package com.day4;

public class cast4 {
	
public static void main(String[] args) {
		
		//if the values are small and can be accomodated then no issues.
		
		double b1=20;
		
		short s1=(short)b1; 
		int i1=(int)b1; 
		float f1=(float)b1; 
		double d1=(double)b1;
		byte b3=(byte)b1;
		long l1=(long)b1;
		
		System.out.println(s1); //20
		System.out.println(i1); //20
		System.out.println(f1); //20.0
		System.out.println(d1); //20.0
		System.out.println(b3); //20
		System.out.println(l1); //20
		
		
		short s2=200;
		byte b2=(byte)s2;
		System.out.println(b2); //-56
//		Why we got -56-
//		Total number of characters in byte can be 256.
//		We want to store 200. So 200-256=-56.
		
		
		int p=100;
		float f=p;
		System.out.println(f); //100.0
		
		
		float f11=12.33f;
		int p11=(int)f11;
		System.out.println(p11); //12
		
		
		int d11=1000;
		double dd=d11;
		System.out.println(dd); //1000.0
		
		
		
		char c1='a';
		
		int w=c1; //allowed to store char.
//		short w1=c1; //Type mismatch: cannot convert from char to short
		long w2=c1; //allowed to store char.
//		byte w3=c1; //Type mismatch: cannot convert from char to byte
		float w4=c1; //allowed to store char.
		double w5=c1; //allowed to store char.
		
		System.out.println(w); //97
		System.out.println(w2); //97
		System.out.println(w4); //97.0
		System.out.println(w5); //97.0
		
		
		//cast and then anything can work
		short s3=(short)c1;
		byte b4=(byte)c1;
		System.out.println(s3); //97
		System.out.println(b4); //97
		
		


	}

}

package com.day4;

public class cast5 {
	
public static void main(String[] args) {
		
	//numbers to characters.
	
	int i1=87;
//	char c1=i1; //Type mismatch: cannot convert from int to char
	char c1=(char)i1;
	System.out.println(c1); //W
	
	byte b1=100;
//	char c2=b1; //Type mismatch: cannot convert from byte to char
	char c2=(char)b1;
	System.out.println(c2); //d
	
	short s1=100;
//	char c3=s1; //Type mismatch: cannot convert from short to char
	char c3=(char)s1;
	System.out.println(c3); //d
	
	long l1=100;
//	char c4=l1; //Type mismatch: cannot convert from long to char
	char c4=(char)l1;
	System.out.println(c4); //d
	
	float f1=100.456654f;
//	char c5=f1; //Type mismatch: cannot convert from float to char
	char c5=(char)f1;
	System.out.println(c5); //d
	
	double d1=100.34324324;
//	char c6=d1; //Type mismatch: cannot convert from double to char
	char c6=(char)d1;
	System.out.println(c6); //d


	}

}

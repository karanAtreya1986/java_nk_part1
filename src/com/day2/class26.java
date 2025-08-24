package com.day2;

public class class26 {
	
	public static void main(String[] args) {
		
//		Because today it is 10 and 20.
//		So when we add its 30.
//		Tomorrow if x and y changes to something big and out of range of byte, then it gives error.
//		So first only java throws error that we cant add bytes.

		
		byte b1=10;
		byte b2=20;
		byte b3=b1+b2; //Type mismatch: cannot convert from int to byte
		System.out.println(b3); 
	}

}

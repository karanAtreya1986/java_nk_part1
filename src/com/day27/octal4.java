package com.day27;

public class octal4 {

	public static void main(String[] args) {
		
		//return type should also be able to hold the value returned.
		//else error.
		byte l=0717; //Type mismatch: cannot convert from int to byte
		System.out.println(l);
	}
}

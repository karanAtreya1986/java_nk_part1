package com.day3;

public class char2 {
	
	public static void main(String[] args) {
		
		//to get ascii of any character type cast it using any data type.
//		We can type cast using any numeric data type like int, long etc.
		
		char c1='a';
		
		System.out.println(c1); //a
		System.out.println((int)c1); //97
		System.out.println((byte)c1); //97
		System.out.println((short)c1); //97
		System.out.println((long)c1); //97
		System.out.println((float)c1); //97.0
		System.out.println((double)c1); //97.0
		
		System.out.println((byte)'$'); //36
	}

}

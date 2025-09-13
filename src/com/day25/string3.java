package com.day25;

public class string3 {

	public static void main(String[] args) {
		
		String str = "hi this is my java code and i am so happy";
		
//try using negative index.
		
		char c1=str.charAt(-234);
		System.out.println(c1);
	}
}

//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: 
//	Index -234 out of bounds for length 41


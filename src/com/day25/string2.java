package com.day25;

public class string2 {

	public static void main(String[] args) {
		
		String str = "hi this is my java code and i am so happy";
		
		//character at any index.
		char c1=str.charAt(0);
//		char c2=str.charAt(423432);
		
		System.out.println(c1); //h
//		System.out.println(c2);//Exception in thread "main" 
		//java.lang.StringIndexOutOfBoundsException: Index 423432 out of bounds for length 41
	}
}


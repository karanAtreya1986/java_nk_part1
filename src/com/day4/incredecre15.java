package com.day4;

public class incredecre15 {
	
	public static void main(String[] args) {
		
		int i=10;
		
		int j=i++ - --i + ++i - i--;
		
		System.out.println(i); //10
		System.out.println(j); //0 -- 10(11) - 10 + 11 - 11(10)
	}

}

package com.day7;

public class array15 {
	
	public static void main(String[] args) {
		
		//negative index not allowed.
		int[] arr = new int[-4];
		
		System.out.println(arr);
		
	}
	
}
//Exception in thread "main" java.lang.NegativeArraySizeException: -4
//at com.day7.array15.main(array15.java:7)


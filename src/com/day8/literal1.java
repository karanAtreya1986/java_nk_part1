package com.day8;

public class literal1 {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5}; //array literals, static array.
		
		System.out.println(arr.length);//5
		System.out.println(arr[0]); //1
		
//		System.out.println(arr[10]);
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
//		at com.day8.literal1.main(literal1.java:12)
		arr[0]=7878;
		System.out.println(arr[0]); //7878
	}

}

package com.day7;

public class array2 {
	
	public static void main(String[] args) {
		
		//negative index not allowed.
		int a[]=new int[5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		System.out.println(a[-4]); 
	}

}

//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -4 out of bounds for length 5
//at com.day7.array2.main(array2.java:16)

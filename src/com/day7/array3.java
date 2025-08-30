package com.day7;

public class array3 {
	
	public static void main(String[] args) {
		
		//cannot use index which is higher than the size.
		int a[]=new int[5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		System.out.println(a[14]); 
	}

}

//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 5
//at com.day7.array3.main(array3.java:16)
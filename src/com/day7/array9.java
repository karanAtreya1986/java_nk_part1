package com.day7;

public class array9 {
	
	public static void main(String[] args) {
		
		int a[]=new int[5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
	
		
		//another way to print.
		//we get index out of bounds for last index.
		for (int i = 0; i <= a.length; i++) {
		    System.out.println(a[i]);
		}
	}

}

//10
//20
//30
//40
//50
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//	at com.day7.array9.main(array9.java:18)

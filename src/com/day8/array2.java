package com.day8;

public class array2 {
	
	public static void main(String[] args) {
		
		int a[]=new int[4];
		
		a[0]=12;
		a[1]=34;
		a[2]=45;
		a[3]=67;
		
		//if data type doesnt match then error.
		
		for (String value : a) { //Type mismatch: cannot convert from element type int to String
		    System.out.println(value);
		}
	}

}



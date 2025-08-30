package com.day8;

public class array1 {
	
	public static void main(String[] args) {
		
		int a[]=new int[4];
		
		a[0]=12;
		a[1]=34;
		a[2]=45;
		a[3]=67;
		
		//print arrays using for each.
		
		for (int value : a) {
		    System.out.println(value);
		}
	}

}

//12
//34
//45
//67


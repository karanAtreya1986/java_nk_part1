package com.day7;

public class array14 {
	
	public static void main(String[] args) {
		
		int p[]=new int[5];
		
		//run time it will give error of index issue.
	
		p[14]=50;
		
		System.out.println(p[14]);
	}

}

//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 5
//at com.day7.array14.main(array14.java:11)
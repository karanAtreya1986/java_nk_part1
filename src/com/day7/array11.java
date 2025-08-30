package com.day7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class array11 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		
		//without for loop print array values.
		//use to string method.
		//prints array memory address.
		
		String s1;
		try {
			s1 = Arrays.toString(); //Cannot make a static reference to the non-static method 
			//toString() from the type Object
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s1); 
		
		System.out.println(Arrays.toString()); //Cannot make a static reference to the non-static method 
		//toString() from the type Object
	}

}

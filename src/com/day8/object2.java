package com.day8;

public class object2 {
	
	public static void main(String[] args) {
		
		//use for each to print the object array.
		
		Object[] arr = new Object[5];
		arr[0] = 10;
		arr[1] = "Hello";
		arr[2] = 3.14;
		arr[3] = true;
		arr[4] = 'A';

		for (Object value : arr) {
		    System.out.println(value);
		}
	}

}

//10
//Hello
//3.14
//true
//A


package com.day8;

public class object3 {
	
	public static void main(String[] args) {
		
		//use normal for loop to print object array.
		
		Object[] arr = new Object[5];
		arr[0] = 10;
		arr[1] = "Hello";
		arr[2] = 3.14;
		arr[3] = true;
		arr[4] = 'A';

		for (int i = 0; i <=arr.length-1; i++) {
		    System.out.println(arr[i]);
		}
	}

}

//10
//Hello
//3.14
//true
//A


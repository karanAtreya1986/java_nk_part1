package com.day8;

import java.util.Arrays;

public class object1 {
	
	public static void main(String[] args) {
		
		
		//create object array.
		//can store anything inside it.
		
		Object[] arr = new Object[5];
		arr[0] = 10;
		arr[1] = "Hello";
		arr[2] = 3.14;
		arr[3] = true;
		arr[4] = 'A';

		System.out.println(Arrays.toString(arr));
	}

}

//[10, Hello, 3.14, true, A]

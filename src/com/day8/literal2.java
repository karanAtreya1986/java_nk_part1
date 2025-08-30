package com.day8;

import java.util.Arrays;

public class literal2 {
		
			
			public static void main(String[] args) {
				
				int[] arr = {1, 2, 3, 4, 5}; //array literals, static array.
				
				System.out.println(arr.length); //5
				System.out.println(arr[0]);  //1
				
				System.out.println(Arrays.toString(arr)); //[1, 2, 3, 4, 5]
				arr[0]=7878;
				System.out.println(Arrays.toString(arr)); //[7878, 2, 3, 4, 5]
			}

		

	}



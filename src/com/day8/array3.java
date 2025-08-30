package com.day8;

public class array3 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;

		//for each with break.
		
		for (int value : arr) {
		    System.out.println(value); //10

		    break;
		}
	}

}

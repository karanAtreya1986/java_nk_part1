package com.day8;

public class reverse1 {
	
	public static void main(String[] args) {
		
		//print reverse of array.
		
		int[] arr = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;

		for (int i = arr.length - 1; i >= 0; i--) {
		    System.out.println(arr[i]);
		}
	}

}

//40
//30
//20
//10


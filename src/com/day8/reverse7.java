package com.day8;

public class reverse7 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;

		// Print in reverse using for loop
		System.out.println("Reverse order:");
		for (int i = arr.length - 1; i >= 0; i--) {
		    System.out.println(arr[i]);
		}

		// Print normally using for-each loop
		System.out.println("Normal order:");
		for (int value : arr) {
		    System.out.println(value);
		}
	}

}

//Reverse order:
//40
//30
//20
//10
//Normal order:
//10
//20
//30
//40





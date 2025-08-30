package com.day8;

public class reverse3 {
	
	public static void main(String[] args) {
		
		//print reverse of array.
		
		int[] arr = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;

		int count = arr.length-1;
		
		for(int e:arr) {
			System.out.println(arr[count]);
			count--;
		}
	}

}

//40
//30
//20
//10



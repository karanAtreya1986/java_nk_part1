package com.day8;

public class reverse6 {
	
	public static void main(String[] args) {
		
		//print reverse of array.
		
		int[] arr = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;

		int count = arr.length-1;
		
		//more visually appealing code.
		for(int e:arr) {
			e=count;
			System.out.println(e + "=" + arr[e]);
			count--;
		}
	}

}

//3=40
//2=30
//1=20
//0=10




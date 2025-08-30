package com.day7;

public class array5 {

	public static void main(String[] args) {
		
		//get the lowest, length and highest index.
		int[] arr = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		
		System.out.println("lowest index is " +0); //lowest index is 0
		int len=arr.length;
		System.out.println("lenght is " +len); //lenght is 4
		System.out.println("highest index is " +(len-1)); //highest index is 3
	}
}

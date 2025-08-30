package com.day8;

public class array8 {
	
	public static void main(String[] args) {
		
		//print ascii value of characters.
		char[] arr = new char[4];
		arr[0] = 'A';
		arr[1] = '1';
		arr[2] = '@';
		arr[3] = 'Z';
		
		for (char value : arr) {
		    System.out.println((byte)value);
		}
	}

}

//65
//49
//64
//90


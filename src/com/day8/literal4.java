package com.day8;

public class literal4 {
	
	public static void main(String[] args) {
		
		//[] can be before array name or after array name.
		String arr[] = {"Apple", "Banana", "Cherry", "Date"};

		System.out.println("Length: " + arr.length);

		for (String value : arr) {
		    System.out.println(value);
		}
	}

}

//Length: 4
//Apple
//Banana
//Cherry
//Date


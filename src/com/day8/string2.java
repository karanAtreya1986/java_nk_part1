package com.day8;

public class string2 {

	public static void main(String[] args) {
		
//		for each with break.
		String[] arr = new String[4];
		arr[0] = "Apple";
		arr[1] = "Banana";
		arr[2] = "Cherry";
		arr[3] = "Date";

		for (String value : arr) {
		    System.out.println(value); //apple
		    if(value.equals("Apple")) {
			    System.out.println("apple fruit found"); //apple fruit found.
			    break;
		    }
		}
	}
}


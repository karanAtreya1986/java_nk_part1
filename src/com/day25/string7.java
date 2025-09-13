package com.day25;

public class string7 {

	public static void main(String[] args) {
		
//validate if string present at specific location.
		//used to check if word present at correct location.

		String message="welcome admin";
		
		if(message.indexOf("admin")==8) {
			System.out.println("admin is present");
		}
		else {
			System.out.println("admin is not present");
		}

	}
}

//admin is present



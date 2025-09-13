package com.day25;

public class string14 {

	public static void main(String[] args) {

		//contains with if-else.
		//returns boolean.

		String test = "I love Java coding";
		boolean b1=test.contains("Java");
		boolean b2=test.contains("java");

		if(test.contains("Java")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
	}

}


//PASS





package com.day25;

public class string8 {

	public static void main(String[] args) {

		//check if word present at index starting from zero.

		String m1 = "By creating an account you will be able to shop faster, "
				+ "be up to date on an order's status, "
				+ "and keep track of the orders you have previously made";

		if(m1.indexOf("shop faster")>=0) {
			System.out.println("admin is present");
		}
		else {
			System.out.println("admin is not present");
		}

	}
}

//admin is present



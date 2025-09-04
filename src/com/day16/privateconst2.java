package com.day16;

public class privateconst2 {
	
	private privateconst2() {
		System.out.println("this is private constructor.");
	}

	public static void main(String[] args) {
		privateconst2 obj = new privateconst2();
	}
}

//this is private constructor.

package com.day16;

public class privateconst1 {
	
	private privateconst1() {
		System.out.println("this is private constructor.");
	}

	//in same class private works.
	public static void main(String[] args) {
		privateconst1 obj = new privateconst1();
	}
}

//this is private constructor.

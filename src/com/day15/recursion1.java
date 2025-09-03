package com.day15;

public class recursion1 {
	
	//recursion function.
	//calling itself again and again.
	
	public static void getnumber() {
		System.out.println("get the number");
		getnumber();
	}

	public static void main(String[] args) {
		recursion1.getnumber();

	}

}

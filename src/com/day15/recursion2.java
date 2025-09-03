package com.day15;

public class recursion2 {
	
	//recursion function.
	//calling itself again and again.
	//recursive function can be static or non static.
	
	public void getnumber() {
		System.out.println("get the number");
		getnumber();
	}

	public static void main(String[] args) {
		recursion2 obj = new recursion2();
		obj.getnumber();

	}

}

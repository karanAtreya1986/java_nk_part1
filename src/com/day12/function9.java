package com.day12;

public class function9 {
	
	//some input and return.
	
	public int add(int a, int b) { 
		System.out.println("add two numbers");
		int c=a+b;
		return c;
	}
	
	public static void main(String[] args) {
		function9 obj = new function9();
		int result=obj.add(10, 20); 
		System.out.println(result);
	}

}

//add two numbers
//30


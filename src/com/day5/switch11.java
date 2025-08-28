package com.day5;

public class switch11 {
	
	public static void main(String[] args) {
		
//		switch case cannot work with float.
		
		float marks=10.67f;
		
		switch (marks) { //Cannot switch on a value of type float. Only convertible int 
//		values, strings or enum variables are permitted
		case 1:
			System.out.println("hello");
			break;
		case 2:
			System.out.println("byee");
			break;

		default: 
			System.out.println("default"); //default
			break;
		}

}
}

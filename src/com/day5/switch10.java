package com.day5;

public class switch10 {
	
	public static void main(String[] args) {
		
//		switch case cannot work with long.
		
		long marks=10L;
		
		switch (marks) { //Cannot switch on a value of type long. Only convertible int values, 
//		strings or enum variables are permitted
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

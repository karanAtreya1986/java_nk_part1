package com.day5;

public class switch6 {
	
	public static void main(String[] args) {
		
//case cannot have conditions.
		
		int marks=100;
		
		switch(marks) {
		case marks>100; //Case constant of type boolean is incompatible with switch selector type int
		System.out.println("hello");
		}

	}

}

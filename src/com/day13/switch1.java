package com.day13;

public class switch1 {
	
	public int getstudentmarks(String name) {
		System.out.println("student name is "+ name);
		
		switch (name.toLowerCase().trim()) {
		case "piyush":
			return 80;
			break; //Unreachable code
		case "rose":
			return 90;
		case "tiger":
			return 70;
		default:
			System.out.println("pass right student name");
			return -1; //best practice to return false or negative boolean when no condition match.
			//we can also return zero.
		}
	}

}

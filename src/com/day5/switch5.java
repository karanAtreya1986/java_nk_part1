package com.day5;

public class switch5 {
	
	public static void main(String[] args) {
		
//even default need not have break.
		
		String browser = "testing";
		
		switch (browser) {
		case "chrome":
			System.out.println("open chrome"); 
			
		case "safari":
			System.out.println("open safari");
			
		
			
		case "ff": 
			System.out.println("open ff");
			
		
			

		default:
			System.out.println("invalid case" + " " + browser); //invalid case testing
			
			
		case "ie":
			System.out.println("open ie"); //open ie
			break;
		}

	}

}

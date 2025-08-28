package com.day5;

public class switch3 {
	
	public static void main(String[] args) {
		
//see how this program runs.
		
		String browser = "ie";
		
		switch (browser) {
		case "chrome":
			System.out.println("open chrome"); 
			
		case "safari":
			System.out.println("open safari");
			
		case "ie":
			System.out.println("open ie"); //open ie
			break;
			
		case "ff": 
			System.out.println("open ff");
			
		
			

		default:
			System.out.println("invalid case");
			break;
		}

	}

}

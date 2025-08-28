package com.day5;

public class switch14 {
	
	public static void main(String[] args) {
		
//write function inside switch.
		
		String browser = "CHROME";
		
		switch (browser.toLowerCase()) {
		case "chrome":
			System.out.println("open chrome"); 
			
		case "safari":
			System.out.println("open safari");
			
		
			
		case "ff": 
			System.out.println("open ff");
			
		
			

		default:
			System.out.println("invalid case" + " " + browser); 
			
			
		case "ie":
			System.out.println("open ie"); 
			break;
		}

	}

}

//open chrome
//open safari
//open ff
//invalid case CHROME
//open ie

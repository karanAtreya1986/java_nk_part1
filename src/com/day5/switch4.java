package com.day5;

public class switch4 {
	
	public static void main(String[] args) {
		
//default need not be the last one.
		//case can be after default also.
		
		String browser = "ie";
		
		switch (browser) {
		case "chrome":
			System.out.println("open chrome"); 
			
		case "safari":
			System.out.println("open safari");
			
		
			
		case "ff": 
			System.out.println("open ff");
			
		
			

		default:
			System.out.println("invalid case");
			break;
			
		case "ie":
			System.out.println("open ie"); //open ie
			break;
		}

	}

}

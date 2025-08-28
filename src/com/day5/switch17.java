package com.day5;

public class switch17 {
	
	public static void main(String[] args) {
		
//nested switch statement.
		
		String browser = "     CHROME       ";
		int version=23434;
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("open chrome"); 
			
			switch (version) {
			case 1:
				System.out.println("version1");
				break;
				
			case 23434:
				System.out.println("version 23434");
				break;

			default:
				break;
			}
			
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
//version 23434
//open safari
//open ff
//invalid case      CHROME       
//open ie

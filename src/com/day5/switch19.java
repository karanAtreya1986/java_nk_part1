package com.day5;

public class switch19 {
	
	public static void main(String[] args) {
		
//case cannot be nested.
		//every switch can have only case under them.
		
		String browser = "     testing       ";
		int version=23434;
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("open chrome"); 
			
			switch (version) {
			case 1:
				System.out.println("version1");
				break;
				
			case 2:
				System.out.println("version 2");
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

//invalid case      testing       
//open ie

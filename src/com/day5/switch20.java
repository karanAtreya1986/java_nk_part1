package com.day5;

public class switch20 {
	
	public static void main(String[] args) {
		
//any logic can be written inside case.
		
		String browser = "     chROME       ";
		int version=23434;
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("open chrome"); 
			int i=1;
			System.out.println(++i);
			
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

//open chrome
//2
//version 23434
//open safari
//open ff
//invalid case      chROME       
//open ie

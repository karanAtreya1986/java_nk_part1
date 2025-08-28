package com.day5;

public class switch16 {
	
	public static void main(String[] args) {
		
//space in ends and middle. use trim. trim wont remove from middle.
		//this is not correct and cant be solved unless we write function.
		
		String browser = "     CHR   OME       ";
		
		switch (browser.toLowerCase().trim()) {
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

//invalid case      CHR   OME       
//open ie

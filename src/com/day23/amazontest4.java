package com.day23;

public class amazontest4 {
	
	public static void main(String[] args) {
		
		String browser="chrome";
		
		switch(browser) {
		
		case "chrome":
			System.out.println("Chrome browser");
			break;
			
		case "safari":
			System.out.println("safari browser");
			break;
			
		case "firefox":
			System.out.println("firefox browser");
			break;
			
		case "edge":
			System.out.println("edge browser");
			break;
			
		default:
			System.out.println("please pass right browser");
			throw new myexception("wrong browser is passed");
			//throw and break cannot come together.
			break; //Unreachable code
		}

		
		System.out.println("byee");
	}

}

//Chrome browser
//byee


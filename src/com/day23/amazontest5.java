package com.day23;

public class amazontest5 {
	
	public static void main(String[] args) {
		
		String browser="ie";
		
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
		}

		
		System.out.println("byee");
	}

}

//please pass right browser
//Exception in thread "main" com.day23.myexception: wrong browser is passed
//	at com.day23.amazontest5.main(amazontest5.java:29)



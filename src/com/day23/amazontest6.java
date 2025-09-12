package com.day23;

public class amazontest6 {
	
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
			//throw can be inside try also.
			//but catch block wont run as exception not catched and handled.
			try {
				throw new myexception("wrong browser is passed");
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}

		
		System.out.println("byee");
	}

}

//please pass right browser
//com.day23.myexception: wrong browser is passed
//byee




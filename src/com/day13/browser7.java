package com.day13;

public class browser7 {
	
	public boolean launchBrowser(String browserName) {
		
//		Wrong handling of flag-
//		Even with invalid browser, it gives flag true.


	    System.out.println("browser name : " + browserName);
	    boolean flag = true;

	    
	    switch (browserName.trim().toLowerCase()) { 

	        case "chrome":
	            System.out.println("launch google chrome");
	            break;

	        case "firefox":
	            System.out.println("launch firefox");
	            break;

	        case "edge":
	            System.out.println("launch edge");
	            break;

	        case "safari":
	            System.out.println("launch safari");
	            break;

	        default:
	            System.out.println("plz pass the right browser name : " + browserName);
	            break;
	    }

	    return flag;
	}
	
	public static void main(String[] args) {
		
		browser7 b3=new browser7();
		boolean exec=b3.launchBrowser("wrong browser");
		System.out.println(exec);
		
		if(exec) {
			System.out.println("run the url");
		}
	}

}

//browser name : wrong browser
//plz pass the right browser name : wrong browser
//true
//run the url



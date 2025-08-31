package com.day13;

public class browser3 {
	
	public boolean launchBrowser(String browserName) {

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
		
		browser3 b3=new browser3();
		boolean exec=b3.launchBrowser("chrome");
		System.out.println(exec);
	}

}

//browser name : chrome
//launch google chrome
//true


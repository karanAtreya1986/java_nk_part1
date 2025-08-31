package com.day13;

public class browser6 {
	
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
		
		browser6 b3=new browser6();
		boolean exec=b3.launchBrowser("chrome");
		System.out.println(exec);
		
		if(exec) {
			System.out.println("enter the url");
		}
	}

}

//browser name : chrome
//launch google chrome
//true
//enter the url



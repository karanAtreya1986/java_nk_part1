package com.day13;

public class browser9 {
	
	 public boolean launchBrowser(String browserName) {
		 
		 //another way to handle flags in nice way.
		 //start with false and make try and break when condition satisfied.

	        System.out.println("browser name : " + browserName);
	        boolean flag = false;

	        switch (browserName.toLowerCase().trim()) {

	            case "chrome":
	                System.out.println("launch google chrome");
	                flag = true;
	                break;

	            case "firefox":
	                System.out.println("launch firefox");
	                flag = true;
	                break;

	            case "edge":
	                System.out.println("launch edge");
	                flag = true;
	                break;

	            case "safari":
	                System.out.println("launch safari");
	                flag = true;
	                break;

	            default:
	                System.out.println("plz pass the right browser name : " + browserName);
	                // flag = false;  // already initialized as false
	                break;
	        }

	        return flag;
	    }
	 
	 public static void main(String[] args) {
		
		 browser9 b = new browser9();
		boolean exec= b.launchBrowser("chrome");
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

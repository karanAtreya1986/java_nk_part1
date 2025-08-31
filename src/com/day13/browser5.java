package com.day13;

public class browser5 {
	
	public boolean launchBrowser(String browserName) {

	    System.out.println("browser name : " + browserName);
	    boolean flag = false;

	    
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
		
		browser5 b3=new browser5();
		boolean exec=b3.launchBrowser("chrome");
		System.out.println(exec);
		
		if(exec) {
			System.out.println("run the url");
		}
	}

}

//browser name : chrome
//launch google chrome
//false



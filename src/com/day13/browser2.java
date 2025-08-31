package com.day13;

public class browser2 {
	
	public boolean launchBrowser(String browserName) {

	    System.out.println("browser name : " + browserName);
	    boolean flag = true;

	    //switch cannot have boolean as its parameter.
	    switch (flag) { //Cannot switch on a value of type boolean. Only convertible int 
//	    values, strings or enum variables are permitted
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

}
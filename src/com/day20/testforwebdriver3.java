package com.day20;

public class testforwebdriver3 {

	public static void main(String[] args) {

		//top casting solves manual changes.
		String browsername ="chrome";
		webdriver3 driver=null;
		
		switch(browsername.trim().toLowerCase()){
		case "chrome":
			driver=new chromedriver3();
			break;
		case "ff":
			driver=new ffdriver3();
			break;
		case "safari":
			driver=new safaridriver3();
			break;
		default:
			System.out.println("invalid browser name " + browsername);
			break;
			}
		
		//can call default methods from interface directly.
		driver.getlogs();
		String s1=driver.getlocations("tatanka");
		System.out.println(s1);
	
	}

}

//default constructor of chrome driver class
//get logs
//get locations
//tatanka







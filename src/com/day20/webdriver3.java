package com.day20;

public interface webdriver3 {

	public void get(String url);

	public String getTitle();

	public void click(String element);

	public void sendKeys(String element, String value);

	public void close();
	
	//default method in webdriver.
	default void getlogs() {
		System.out.println("get logs");
	}
	
	//create default method with parameter and return type.
	default String getlocations(String url) {
		System.out.println("get locations");
		return url;
	}
	
	//default method which is static.
	//Illegal combination of modifiers for the interface method getnames; 
	//only one of abstract, default, or static permitted
//	default static String getnames(String name) {
//		System.out.println("get names");
//		return name;
//	}

}

package com.day13;

public class browser1 {
	
	public void click(String element) {
		System.out.println("click on the element " + element);
	}
	
	public void sendkeys(String element, String value) {
		System.out.println("sendkeys on the element " + element + " with value " + value);
	}
	
	public String gettitle() {
		return "google";
	}

}

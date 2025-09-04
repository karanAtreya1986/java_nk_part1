package com.day16;

public class browser1 {
	
	//encapsulation can be for methods and variables.
	//good example of encapsulation.
	
	public void launchbrowser() {
		System.out.println("launch browser");
		checkramsize();
		checkbrowserupdates();
		int b1= verifystorage();
		System.out.println(b1);
		checkbrowserpolicy();
		System.out.println("end of the public method");
	}
	
	private void checkramsize() {
		System.out.println("check ram size");
	}
	
	private void checkbrowserupdates() {
		System.out.println("check for browser updates");
	}
	
	//we can have return type also.
	private int verifystorage() {
		System.out.println("verify storage");
		return 10;
	}
	
	private void checkbrowserpolicy() {
		System.out.println("check browser policy");
	}
	
	public static void main(String[] args) {
		
		browser1 b1=new browser1();
		b1.launchbrowser();
	}

}

//launch browser
//check ram size
//check for browser updates
//verify storage
//10
//check browser policy
//end of the public method


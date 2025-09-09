package com.day20;

public class login6 extends page6 {
	
	@Override
	public boolean unloading() {
		System.out.println("child class override unloading");
		return true;
	}
	
	//create one method with return.
	public String url() {
		System.out.println("child class url overridden method");
		return "gorilla";
	}
	
	//create one method without return.
	public void title() {
		System.out.println("child class login title overridden method");
	}

}

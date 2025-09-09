package com.day20;

public class login8 extends page8 {

	@Override
	public boolean unloading() {
		System.out.println("child class override unloading");
		return false;
	}

	@Override
	public void loading() {
		System.out.println("child class override loading");
	}
	

}

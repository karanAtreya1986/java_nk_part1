package com.day20;

public class login7 extends page7 {

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

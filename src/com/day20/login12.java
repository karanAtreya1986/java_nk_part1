package com.day20;

public class login12 extends page12 {
	
	//name and id taken from parent itself.

	public login12() {
		this.name=name;
		this.id=id;
		System.out.println(this.name);
		System.out.println(this.id);
		System.out.println("default child constructor");
	}
	
	public login12(String name, int id) {
		this.name=name;
		this.id=id;
		System.out.println(this.name);
		System.out.println(this.id);
		System.out.println("parameter child constructor");
	}

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

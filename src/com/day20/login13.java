package com.day20;

public class login13 extends page12 {
	
	//name and id taken from parent itself.

	public login13() {
		//add super here.
		super(); // no constructor to call hence super has no effect.
		this.name=name;
		this.id=id;
		System.out.println(this.name);
		System.out.println(this.id);
		System.out.println("default child constructor");
	}
	
	public login13(String name, int id) {
//		super(name, id);//The constructor page12(String, int) is undefined
		//since there is no parent constructor.
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

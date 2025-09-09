package com.day20;

public class login9 extends page9 {
	
	//name and id taken from parent itself.
	
	//constructor in child class.
		public login9() {
			System.out.println("child class default constructor");
		}
		
		public login9(String name, int id) {
			this.name=name;
			this.id=id;
			System.out.println("child class parameter constructor.");
			System.out.println(this.name);
			System.out.println(this.id);
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

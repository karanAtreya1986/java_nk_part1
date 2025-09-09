package com.day20;

public class login10 extends page10 {
	
	//name and id taken from parent itself.
	
	//constructor in child class.
	//Implicit super constructor page10() is undefined. 
	//Must explicitly invoke another constructor
	//when parent doesnt have default constructor then child also cant have.
	
//		public login10() {
//			//if we add super it says there is no default page10 constructor.
//			super(); //The constructor page10() is undefined
//			System.out.println("child class default constructor");
//		}
	
	//have to call one of the constructor from parent to work.
	public login10() {
		super("karan", 3445);
		System.out.println("default constructor of child class.");
	}
		
	//Implicit super constructor page10() is undefined. 
	//Must explicitly invoke another constructor
//		public login10(String name, int id) {
//			this.name=name;
//			this.id=id;
//			System.out.println("child class parameter constructor.");
//			System.out.println(this.name);
//			System.out.println(this.id);
//		}
	
	//have to call one of the constructor from parent to work.
	public login10(String name, int id) {
		super(name, id);
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

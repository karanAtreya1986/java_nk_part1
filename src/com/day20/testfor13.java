package com.day20;

public class testfor13 {
	//first parent class default constructor called, then child class
	//constructor called.
	//This sequence predefined in java for any inherited class.
	
	//here parent class doesnt have any constructor so no issues.
	//everything called from child.


	public static void main(String[] args) {

		login13 l1=new login13();

		l1.loading();
		l1.title();
		boolean b1=l1.unloading();
		System.out.println(b1);
		String s1=l1.url();
		System.out.println(s1);

		System.out.println("------------");

		login13 l2=new login13("tiger", 543543);

		l1.loading();
		l1.title();
		boolean b2=l1.unloading();
		System.out.println(b1);
		String s11=l1.url();
		System.out.println(s11);

	}

}


//null
//0
//default child constructor
//child class override loading
//parent class login title  method
//child class override unloading
//false
//parent class url method
//gorilla
//------------
//tiger
//543543
//parameter child constructor
//child class override loading
//parent class login title  method
//child class override unloading
//false
//parent class url method
//gorilla








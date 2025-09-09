package com.day20;

public class testfor9 {
	//first parent class default constructor called, then child class
	//constructor called.
	//This sequence predefined in java for any inherited class.


	public static void main(String[] args) {

		login9 l1=new login9();

		l1.loading();
		l1.title();
		boolean b1=l1.unloading();
		System.out.println(b1);
		String s1=l1.url();
		System.out.println(s1);

		System.out.println("------------");

		login9 l2=new login9("tiger", 543543);

		l1.loading();
		l1.title();
		boolean b2=l1.unloading();
		System.out.println(b1);
		String s11=l1.url();
		System.out.println(s11);

	}

}


//default constructor
//child class default constructor
//child class override loading
//parent class login title  method
//child class override unloading
//false
//parent class url method
//gorilla
//------------
//default constructor
//child class parameter constructor.
//tiger
//543543
//child class override loading
//parent class login title  method
//child class override unloading
//false
//parent class url method
//gorilla





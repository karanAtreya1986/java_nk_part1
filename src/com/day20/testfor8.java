package com.day20;

public class testfor8 {
	
	public static void main(String[] args) {
		
		login8 l1=new login8();
		
		l1.loading();
		l1.title();
		boolean b1=l1.unloading();
		System.out.println(b1);
		String s1=l1.url();
		System.out.println(s1);
		
		//we cannot call parameter constructor of abstract from here.
		//The constructor login8(String, int) is undefined
login8 l2=new login8("tiger", 543543);
		
		l1.loading();
		l1.title();
		boolean b1=l1.unloading();
		System.out.println(b1);
		String s1=l1.url();
		System.out.println(s1);
		
	}

}


//default constructor
//child class override loading
//parent class login title  method
//child class override unloading
//false
//parent class url method
//gorilla



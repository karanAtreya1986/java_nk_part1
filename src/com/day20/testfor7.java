package com.day20;

public class testfor7 {
	
	public static void main(String[] args) {
		
		login7 l1=new login7();
		
		l1.loading();
		l1.title();
		boolean b1=l1.unloading();
		System.out.println(b1);
		String s1=l1.url();
		System.out.println(s1);
		
		//downcast not allowed.
		//Cannot instantiate the type page7
		page7 p1=(login7)new page7();
		
	}

}


//child class override loading
//parent class login title  method
//child class override unloading
//false
//parent class url method
//gorilla


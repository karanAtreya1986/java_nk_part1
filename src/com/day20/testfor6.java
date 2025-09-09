package com.day20;

public class testfor6 {
	
	public static void main(String[] args) {
		
		login6 l1=new login6();
		l1.loading();
		l1.title();
		boolean b1=l1.unloading();
		System.out.println(b1);
		String s1=l1.url();
		System.out.println(s1);
	}

}

//Page is loading...
//child class login title overridden method
//child class override unloading
//true
//child class url overridden method
//gorilla


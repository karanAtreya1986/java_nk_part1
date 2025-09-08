package com.day19;

public class testfor8 {

	public static void main(String[] args) {

		//create object of fortis8 and call all methods.
		//capture all return values and print them also.

		fortis8 f1=new fortis8();
		f1.physio();
		String o1=f1.onco();
		System.out.println(o1);
		f1.dental();
		f1.emergency();
		int i1=f1.getstatic1("karan");
		//warning.
		//The static method getstatic1(String) from the type fortis8 
		//should be accessed in a static way
		System.out.println(i1);

		//access with child class name.
		int i2=fortis8.getstatic1("lion");
		System.out.println(i2);

		int i3=usmedical8.getstatic1("cheetah");
		System.out.println(i3);

	}

}

//fortis physio
//fortis onco
//tiger
//fortis dental
//fortis emergency
//get static 1 method from child class
//190
//get static 1 method from child class
//190
//get static 1 method from interface cheetah
//10




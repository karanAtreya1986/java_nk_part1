package com.day19;

public class testfor15 {
	
	public static void main(String[] args) {
		
		fortis14 f1=new fortis14();
		int v1=f1.getstatic1("lion"); //The static method getstatic1(String) from the type fortis14 should be accessed in a static way
		System.out.println(v1);
		f1.getstatic2("tiger");//The static method getstatic2(String) from the type fortis14 should be accessed in a static way
		
		int v2=fortis14.getstatic1("karan");
		System.out.println(v2);
		
		fortis14.getstatic2("new zealand");
		
		int v3=f1.MINFEE;
		System.out.println(v3);
		
		//Cannot instantiate the type usmedical14
//		usmedical14 u1=new usmedical14();
//		int v4=u1.getstatic1("gorilla");
//		System.out.println(v4);
//		u1.getstatic2("zebra");
		
		usmedical14 u1=new fortis14();
		int b1=u1.getdefault("australisa");
		System.out.println(b1);
		
		u1.getdefault1("canada");
		
		int b2=u1.MINFEE;
		System.out.println(b2);
		
		//cant access interface static with the object name.
		//once same method written in child,
		//parent cannot access it.
		
		//can access with interface name.
		int c1=usmedical14.getstatic1("usa");
		System.out.println(c1);
		
		
		usmedical14.getstatic2("west indies");
	}

}

//second static from child classlion
//10
//first static from child classtiger
//second static from child classkaran
//10
//first static from child classnew zealand
//654657567
//first default from interfaceaustralisa
//10
//second default from interfacecanada
//214234
//second static from interfaceusa
//10
//first static from interfacewest indies


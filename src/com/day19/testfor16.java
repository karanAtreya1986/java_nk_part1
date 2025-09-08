package com.day19;

public class testfor16 {
	
	public static void main(String[] args) {
		
		fortis15 f1=new fortis15();
		int v1=f1.MINFEE;
		System.out.println(v1);
		
		int v2=f1.getdefault("karan");
		System.out.println(v2);
		
		f1.getdefault1("pawan");
		
		int v3=f1.getstatic1("ranjani");
		//warning.
		//The static method getstatic1(String) from the type fortis15 should be accessed in a static way
		System.out.println(v3);
		
		int v4=fortis15.getstatic1("poland");
		System.out.println(v4);
		
		f1.getstatic2("uk");
		//warning.
		//The static method getstatic2(String) from the type fortis15 should be accessed in a static way
		
		fortis15.getstatic2("germany");
		
		//Cannot instantiate the type usmedical15
//		usmedical15 u1=new usmedical15();
		
		usmedical15 u1=new fortis15();
		int b1=u1.getdefault("canada");
		System.out.println(b1);
		
		u1.getdefault1("austalisa");
		
		int b2=u1.MINFEE;
		System.out.println(b2);
		
		//cannot access static from interface using objects.
		
		//using interface name we can access.
		int c1=usmedical15.getstatic1("hungary");
		System.out.println(c1);
		
		usmedical15.getstatic2("budapest");
		
		
	}

}

//654657567
//first default from child classkaran
//10
//second default from child classpawan
//second static from child classranjani
//10
//second static from child classpoland
//10
//first static from child classuk
//first static from child classgermany
//first default from child classcanada
//10
//second default from child classaustalisa
//214234
//second static from interfacehungary
//10
//first static from interfacebudapest



package com.day19;

public class testfor23 {
	
	public static void main(String[] args) {
		
		class2 c1=new class2();
		int v1=c1.getdetails("karan");
		System.out.println(v1);
		
//		default2 d2=new default2(); //Cannot instantiate the type default2
		
		default2 d2=new class2();
		int v3=d2.getdetails("default 2");
		System.out.println(v3);
		
//		default1 d1=new default1(); //Cannot instantiate the type default1
		
		default1 d1=new class2();
		int v4=d1.getdetails("jingostan");
		System.out.println(v4);
	}

}

//karan
//100
//default 2
//100
//jingostan
//100


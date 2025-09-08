package com.day19;

public class testfor14 {
	
	public static void main(String[] args) {
		
		fortis13 f1=new fortis13();
		int v1=f1.getdefault("tiger");
		System.out.println(v1);
		
		//Cannot instantiate the type usmedical13
//		usmedical13 u1=new usmedical13();
//		int v2=u1.getdefault("gorilla");
//		System.out.println(v2);
		
		
		usmedical13 u1=new fortis13();
		int v2=u1.getdefault("gorilla");
		System.out.println(v2);
	}

}

//default from interface methodtiger
//10
//default from interface methodgorilla
//10

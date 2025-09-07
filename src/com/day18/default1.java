package com.day18;

//default class.
 class default1 {
	
	public static void main(String[] args) {
		
		System.out.println("hello world");
		
		default1 d1=new default1();
		d1.method1();
		int a=d1.method2(10);
		//warning.
		//The static method method2(int) from the type default1 should be accessed in a static way
		System.out.println(a);
		
		d1.method3();
		
		String name=d1.method4("hello");
		//warning.
		//The static method method4(String) from the type default1 should be accessed in a static way
		System.out.println(name);
		
		int b=default1.method2(10);
		System.out.println(b);
		
		String s1=default1.method4("tiger");
		System.out.println(s1);
	}
	
	public void method1() {
		System.out.println("method 1");
	}
	
	public static int method2(int a) {
		return a;
	}
	
	public final void method3() {
		System.out.println("method 3");
	}
	
	public final static String method4(String name) {
		return name;
	}

}
 
// hello world
// method 1
// 10
// method 3
// hello
// 10
// tiger


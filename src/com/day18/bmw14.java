package com.day18;

public class bmw14 extends car14{
	
	//we can chain any method with anything.
	//overridden methods can also be chained.
	
	String type = "bmw CLASs";
	
	//override method from car12.
	@Override
	public void startengine() {
		System.out.println("bmw start engine method");
		method1();
		method2();
		method3();
		method4();
	}
	
	//create another four methods.
	
	public void method1() {
		System.out.println("method1");
	}
	public void method2() {
		System.out.println("method2");
	}
	public static void method3() {
		System.out.println("method3");
	}
	public final void method4() {
		System.out.println("method4");
	}
	
	//create one method which calls all the above methods inside it.
	public void method5() {
		method1();
		method2();
		method3();
		method4();
		startengine();
	}

}

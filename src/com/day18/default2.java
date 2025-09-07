package com.day18;

//default class can also extend another class.
 class default2 extends bmw14 {
	
	public static void main(String[] args) {
		
		default2 d1=new default2();
		d1.method5();
		d1.startengine();
		String name=d1.type;
		System.out.println(name);
		d1.karanmethod();
		d1.karanmethod1();
		d1.method1();
		d1.method2();
		d1.method4();
		d1.startengine();
		d1.method3();//The static method method3() from the type bmw14 should be 
		//accessed in a static way
		
		default2.method3();//default can access static method by the class name.
		bmw14.method3(); //bmw can call its static method.
		

}
	
 }
 
 
// method1
// method2
// method3
// method4
// bmw start engine method
// method1
// method2
// method3
// method4
// bmw start engine method
// method1
// method2
// method3
// method4
// bmw CLASs
// method1
// method2
// method3
// method4
// bmw start engine method
// method1
// method2
// method3
// method4
// method1
// method2
// method3
// method4
// bmw start engine method
// method1
// method2
// method3
// method4
// method1
// method2
// method3
// method4
// bmw start engine method
// method1
// method2
// method3
// method4
// method1
// method2
// method4
// bmw start engine method
// method1
// method2
// method3
// method4
// method3
// method3
// method3




package com.day19;

//can implement multiple interface.
public class fortis17 implements usmedical17{


	public void pathservices(String name) {
		System.out.println("pathology services from fortis " +name);
		//another way to call default in child class.
		//directly call the method name.
		getprivateMethod(name);
	}
	
}

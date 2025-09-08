package com.day19;

public interface usmedical13 {
	
	//in interface we can have default method.
	//but it has to have body.
	
	//create default method.
	default int getdefault(String name) {
		System.out.println("default from interface method" + name);
		return 10;
	}
	
	
	//without body error -
	//This method requires a body instead of a semicolon
//	default int getdefault(String name);

}

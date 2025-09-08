package com.day19;

public class class2 implements default1, default2 {

	@Override
	public int getdetails(String name) {
		// TODO Auto-generated method stub
		return default1.super.getdetails(name);
	}
	//Duplicate default methods named getdetails with the parameters (String) and (String) are inherited from the types default2 and default1
	
	//at a time we can override from one interface.
	//if two interfaces have same default method implementation.

}

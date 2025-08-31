package com.day13;

public class duplicate1 {
	
	//cannot have duplicate method in one class.
	
	public void test1() {
		
	}
	
	public void test1() { //Duplicate method test1() in type duplicate1
		
	}
	
	public double test1() { //Duplicate method test1() in type duplicate1
		
	}
	
	public void test1(String name) { //not duplicate.
		
	}
	
public void test1(String name) { //Duplicate method test1(String) in type duplicate1
		
	}

public double test1(String name) { //Duplicate method test1(String) in type duplicate1
	
}

//so return type doesnt matter when checking for duplicacy, only the parameters matter.

}

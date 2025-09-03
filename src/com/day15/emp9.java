package com.day15;

public class emp9 {
	
	String name;
	int age;
	double salary;
	boolean isPermanent;
	char gender;
	
	//static variable.
	static int w; //can be initialised later.
	
	public emp9(String name, int age) {
		System.out.println("zero parameter constructor");
		this.w=w; //warning - The assignment to variable w has no effect
		//this is for objects not static.
	}
	
	
}







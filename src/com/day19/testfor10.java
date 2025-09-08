package com.day19;

public class testfor10 {

	public static void main(String[] args) {

		//can access only usmedical10 and common methods.
		usmedical10 u1=new fortis10("karan", 10);
		u1.dental();
		u1.emergency();
		String s1=u1.onco();
		System.out.println(s1);
		u1.physio();
	//only us medical and common methods across interfaces can be accessed.
		
		

	}

}

//this is constructor
//fortis dental
//fortis emergency
//fortis onco
//onco
//fortis physio





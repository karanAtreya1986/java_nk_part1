package com.day16;

public class testcompany3 {
	
	public static void main(String[] args) {
		
		//cant create object of private constructor class.
		company3 c1=new company3(); //The constructor company3() is not visible
		c1.getdetails("karan");
		int v1=c1.i;
		System.out.println(v1);
	}

}

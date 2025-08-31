package com.day12;

public class customer6 {

	public int getcustomermarks(String name) {
		//cannot return null with primitive data types.
		
		System.out.println("customer name is " + name);
		
		if(name.trim().equalsIgnoreCase("piyush")) {
			return 80;
		}else if(name.trim().equalsIgnoreCase("rose")) {
			return 90;
		}else if(name.trim().equalsIgnoreCase("tiger")) {
			return 70;
		}else {
			System.out.println("pass right customer name");
			return null; //Type mismatch: cannot convert from null to int
		}
	}
}

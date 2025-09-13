package com.day24;

public class car2 {
	
	String name;
	public int price;
	protected String color;
	private String chasisnumber;
	
	
	
	private int getname(String name) {
		System.out.println("private method get name");
		return 10;
	}
	
	public String billing(int a) {
		System.out.println("car billing method");
		return "billing method";
	}
	
	protected void carname(String a) {
		System.out.println("protected method inside car");
	}
	
	int getlocation(String name) {
		System.out.println("get location method "+name);
		return 10;
	}

}



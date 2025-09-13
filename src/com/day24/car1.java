package com.day24;

public class car1 {
	
	String name;
	public int price;
	protected String color;
	private String chasisnumber;
	
	public static void main(String[] args) {
		
		car1 c=new car1();
		String s1=c.chasisnumber;
		System.out.println(s1);
	}
	
	private int getname(String name) {
		System.out.println("private method get name");
		return 10;
	}

}

//null


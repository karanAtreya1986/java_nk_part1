package com.day24;

public class bmw6  extends car2{

	public static void main(String[] args) {
		
//		Always go towards right.
//		If parent class has protected, then in child class can have public or protected only.

		
		bmw6 b1=new bmw6();
		String s1=b1.color;
		System.out.println(s1);
		b1.carname("karan");
	}
//	Cannot reduce the visibility of the inherited method from car2
//	protected cannot become default in child.
	@Override
	 void carname(String a) {
		System.out.println("protected method inside child class bmw");
	}
	
}


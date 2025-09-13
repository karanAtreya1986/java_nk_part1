package com.day24;

public class bmw4  extends car2{

	public static void main(String[] args) {
		
		bmw4 b1=new bmw4();
		String s1=b1.color;
		System.out.println(s1);
		b1.carname("karan");
	}
	//protected methods can be accessed by child.
	//protected variables can be accessed by child.
	@Override
	protected void carname(String a) {
		System.out.println("protected method inside child class bmw");
	}
	
}

//null
//protected method inside child class bmw

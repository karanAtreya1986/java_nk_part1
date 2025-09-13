package com.day24;

public class bmw11  extends car2{

	public static void main(String[] args) {

		
		bmw11 b1=new bmw11();
		String s1=b1.name;
		System.out.println(s1);
		int i1=b1.getlocation("karan");
		System.out.println(i1);
	}
	
	//default cannot be private in child.
	//Cannot reduce the visibility of the inherited method from car2
	@Override
	private int getlocation(String name) {
		System.out.println("get location method "+name);
		return 10;
	}
	
}





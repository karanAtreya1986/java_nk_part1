package com.day24;

public class bmw8  extends car2{

	public static void main(String[] args) {

		
		bmw8 b1=new bmw8();
		String s1=b1.name;
		System.out.println(s1);
		int i1=b1.getlocation("karan");
		System.out.println(i1);
	}
	
	//default can be default in child.
	@Override
	int getlocation(String name) {
		System.out.println("get location method "+name);
		return 10;
	}
	
}

//null
//get location method karan
//10




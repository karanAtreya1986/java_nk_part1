package com.day24;

public class bmw10  extends car2{

	public static void main(String[] args) {

		
		bmw10 b1=new bmw10();
		String s1=b1.name;
		System.out.println(s1);
		int i1=b1.getlocation("karan");
		System.out.println(i1);
	}
	
	//default can be public  in child.
	@Override
	public int getlocation(String name) {
		System.out.println("get location method "+name);
		return 10;
	}
	
}

//null
//get location method karan
//10




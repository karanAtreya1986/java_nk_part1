package com.day19;

public class testfor22 {
	
	public static void main(String[] args) {
		
		class1 c1=new class1();
		c1.int1();
		c1.int2();
		c1.int3();
		
//		int3 i3=new int3(); //Cannot instantiate the type int3
		int3 i3=new class1();
		i3.int1();
		i3.int2();
		i3.int3();
		
//		int2 i2=new int2(); //Cannot instantiate the type int2
		int2 i2=new class1();
		i2.int1();
		i2.int2();
		
//		int1 i1=new int1(); //Cannot instantiate the type int1
		int1 i1=new class1();
		i1.int1();
	
	}

}

//from interface 1
//from interface 2
//from interface 3
//from interface 1
//from interface 2
//from interface 3
//from interface 1
//from interface 2
//from interface 1


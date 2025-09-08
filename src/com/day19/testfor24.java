package com.day19;

public class testfor24 {
	
	public static void main(String[] args) {
		
		class3 c1=new class3();
		String s1=c1.getdetails();
		System.out.println(s1);
		
		int v1=c1.getdetails("tiger");
		System.out.println(v1);
		
//		default4 d4=new default4();//Cannot instantiate the type default4
		default4 d4=new class3();
		String s2=d4.getdetails();
		System.out.println(s2);
		
		
//		default3 d3=new default3();//Cannot instantiate the type default3
		
		default3 d3=new class3();
		int v2=d3.getdetails("janadhan");
		System.out.println(v2);
	
	}

}

//tiger
//tiger
//100
//tiger
//janadhan
//100


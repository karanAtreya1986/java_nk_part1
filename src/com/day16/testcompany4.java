package com.day16;

public class testcompany4 {
	
	public static void main(String[] args) {
		
		company4 c2=new company4("lion");
		c2.getdetails("karan");
		//warning - The static method getdetails(String) from the type company4 should be accessed in a static way
		int v2=c2.i;
		//warning - The static field company4.i should be accessed in a static way
		System.out.println(v2);
		
		//change the static value.
		int s=company4.i=20;
		System.out.println(s);
		
		company4.getdetails("giraffe");
	}

}

//this is public constructorlion
//hello karan
//10
//20
//hello giraffe

